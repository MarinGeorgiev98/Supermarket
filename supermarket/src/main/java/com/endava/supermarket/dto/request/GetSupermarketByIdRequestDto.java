package com.endava.supermarket.dto.request;

import com.endava.supermarket.constants.ErrorMessages;
import com.endava.supermarket.model.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GetSupermarketByIdRequestDto {
    @NotNull(message = ErrorMessages.NAME_NOT_BLANK_ERROR_MESSAGE)
    private String name;

    @NotNull(message = ErrorMessages.ADDRESS_NOT_BLANK_ERROR_MESSAGE)
    private String address;

    private String phoneNumber;

    private String workhours;

    private List<Item> items;
}
