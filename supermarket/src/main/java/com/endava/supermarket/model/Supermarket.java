package com.endava.supermarket.model;

import com.endava.supermarket.constants.ErrorMessages;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "supermarket")
public class Supermarket extends BaseEntity {
    @NotBlank(message = ErrorMessages.NAME_NOT_BLANK_ERROR_MESSAGE)
    @Column(name = "name", unique = true)
    private String name;

    @NotBlank(message = ErrorMessages.ADDRESS_NOT_BLANK_ERROR_MESSAGE)
    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "workhours")
    private String workhours;

    @OneToMany(mappedBy = "supermarket")
    private List<Item> items;
}
