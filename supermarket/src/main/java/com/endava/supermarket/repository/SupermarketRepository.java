package com.endava.supermarket.repository;

import com.endava.supermarket.model.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupermarketRepository extends JpaRepository<Supermarket, String> {
}
