package com.endava.supermarket.dto.request;

import com.endava.supermarket.constants.ErrorMessages;
import com.endava.supermarket.model.enums.ItemType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ItemRequestDto {
    @NotNull(message = ErrorMessages.NAME_NOT_NULL_ERROR_MESSAGE)
    private String name;

    @NotNull(message = ErrorMessages.PRICE_NOT_NULL_ERROR_MESSAGE)
    private Double price;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ItemType type;
}
