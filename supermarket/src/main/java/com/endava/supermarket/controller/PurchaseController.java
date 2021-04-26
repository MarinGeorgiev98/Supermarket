package com.endava.supermarket.controller;

import com.endava.supermarket.dto.response.GetSupermarketByIdResponseDto;
import com.endava.supermarket.model.Supermarket;
import com.endava.supermarket.service.SupermarketService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/purchase")
public class PurchaseController {
    private final SupermarketService supermarketService;
    private final ModelMapper modelMapper;

    public PurchaseController (SupermarketService supermarketService, ModelMapper modelMapper) {
        this.supermarketService = supermarketService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<GetSupermarketByIdResponseDto> getSupermarketById (@Valid @RequestParam String id) {
        Supermarket supermarket = supermarketService.getSupermarketById(id);
        return ResponseEntity.ok(modelMapper.map(supermarket, GetSupermarketByIdResponseDto.class));
    }
}
