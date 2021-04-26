package com.endava.supermarket.dto.response;

import com.endava.supermarket.model.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GetSupermarketByIdResponseDto {
    private String name;

    private String address;

    private String phoneNumber;

    private String workhours;

    private List<Item> items;
}
