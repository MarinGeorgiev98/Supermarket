package com.endava.supermarket.controller;

import com.endava.supermarket.service.SupermarketService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/purchase")
public class PurchaseController {
    private final SupermarketService supermarketService;
    private final ModelMapper modelMapper;

    public PurchaseController (SupermarketService supermarketService, ModelMapper modelMapper) {
        this.supermarketService = supermarketService;
        this.modelMapper = modelMapper;
    }
}
