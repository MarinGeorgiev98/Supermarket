package com.endava.supermarket.model;

import com.endava.supermarket.constants.ErrorMessages;
import com.endava.supermarket.model.enums.ItemType;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
public class Item extends BaseEntity {
    @NotBlank(message = ErrorMessages.NAME_NOT_BLANK_ERROR_MESSAGE)
    @Column(name = "name")
    private String name;

    @NotNull(message = ErrorMessages.PRICE_NOT_NULL_ERROR_MESSAGE)
    @Column(name = "price", precision = 10, scale = 2)
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    private ItemType type;

    @ManyToOne
    @JoinColumn(name="supermarket_id")
    private Supermarket supermarket;
}
