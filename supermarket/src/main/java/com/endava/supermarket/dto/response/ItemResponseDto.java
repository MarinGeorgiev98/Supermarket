package com.endava.supermarket.dto.response;

import com.endava.supermarket.model.enums.ItemType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
public class ItemResponseDto {
    private String name;

    private Double price;

    @Enumerated(EnumType.STRING)
    private ItemType type;
}
