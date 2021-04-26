package com.endava.supermarket.repository;

import com.endava.supermarket.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
