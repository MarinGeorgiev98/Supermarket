package com.endava.supermarket.dto.response;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AddItemsResponseDto {
    private String supermarketId;

    private List<String> itemIds;
}
