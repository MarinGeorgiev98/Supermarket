package com.endava.supermarket.controller;

import com.endava.supermarket.dto.request.SupermarketRequestDto;
import com.endava.supermarket.dto.response.GetSupermarketByIdResponseDto;
import com.endava.supermarket.dto.response.SupermarketResponseDto;
import com.endava.supermarket.model.Supermarket;
import com.endava.supermarket.service.SupermarketService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/supermarket")
public class SupermarketController {
    private final SupermarketService supermarketService;
    private final ModelMapper modelMapper;

    public SupermarketController(SupermarketService supermarketService, ModelMapper modelMapper) {
        this.supermarketService = supermarketService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<SupermarketResponseDto> createSupermarket(@Valid @RequestBody SupermarketRequestDto supermarketRequestDto) {
        Supermarket supermarket = modelMapper.map(supermarketRequestDto, Supermarket.class);
        supermarket = supermarketService.save(supermarket);
        return new ResponseEntity(modelMapper.map(supermarket, SupermarketResponseDto.class), HttpStatus.CREATED);
    }

    @PostMapping("/addItemsToSupermarket")
    public Supermarket addItemsToSupermarket(@RequestParam String id, @RequestParam List<String> itemIds) {
        return supermarketService.saveItemsToSupermarket(id, itemIds);
    }

    @PostMapping("/getSupermarketById")
    public ResponseEntity<GetSupermarketByIdResponseDto> getSupermarketById (@Valid @RequestParam String id) {
        Supermarket supermarket = supermarketService.getSupermarketById(id);
        return ResponseEntity.ok(modelMapper.map(supermarket, GetSupermarketByIdResponseDto.class));
    }
}
