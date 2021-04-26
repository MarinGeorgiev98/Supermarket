package com.endava.supermarket.service.impl;

import com.endava.supermarket.model.Item;
import com.endava.supermarket.repository.ItemRepository;
import com.endava.supermarket.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
