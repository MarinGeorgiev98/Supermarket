package com.endava.supermarket.controller;

import com.endava.supermarket.dto.request.ItemRequestDto;
import com.endava.supermarket.dto.response.ItemResponseDto;
import com.endava.supermarket.model.Item;
import com.endava.supermarket.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/item")
public class ItemController {
    private final ItemService itemService;
    private final ModelMapper modelMapper;

    public ItemController(ItemService itemService, ModelMapper modelMapper) {
        this.itemService = itemService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<ItemResponseDto> createItem(@Valid @RequestBody ItemRequestDto itemRequestDto) {
        Item item = modelMapper.map(itemRequestDto, Item.class);
        item = itemService.save(item);
        return new ResponseEntity(modelMapper.map(item, ItemResponseDto.class), HttpStatus.CREATED);
    }
}
