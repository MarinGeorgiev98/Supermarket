package com.endava.supermarket.service;

import com.endava.supermarket.model.Supermarket;

import java.util.List;

public interface SupermarketService {
    Supermarket save(Supermarket supermarket);

    Supermarket getSupermarketById(String id);

    Supermarket saveItemsToSupermarket(String id, List<String> itemIds);
}
