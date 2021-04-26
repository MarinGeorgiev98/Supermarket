package com.endava.supermarket.service.impl;

import com.endava.supermarket.model.Item;
import com.endava.supermarket.model.Supermarket;
import com.endava.supermarket.repository.ItemRepository;
import com.endava.supermarket.repository.SupermarketRepository;
import com.endava.supermarket.service.SupermarketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupermarketServiceImpl implements SupermarketService {
    private final SupermarketRepository supermarketRepository;
    private final ItemRepository itemRepository;

    public SupermarketServiceImpl(SupermarketRepository supermarketRepository, ItemRepository itemRepository) {
        this.supermarketRepository = supermarketRepository;
        this.itemRepository = itemRepository;
    }

    public Supermarket save(Supermarket supermarket) {
        return supermarketRepository.save(supermarket);
    }

    public Supermarket saveItemsToSupermarket(String id, List<String> itemIds) {
        Supermarket supermarket = getSupermarketById(id);
        for (String itemId : itemIds) {
            Item item = itemRepository.findById(itemId).get();
            supermarket.getItems().add(item);
        }
        return supermarket;
    }
    public Supermarket getSupermarketById(String id) {
        return supermarketRepository.findById(id).get();
    }
}
