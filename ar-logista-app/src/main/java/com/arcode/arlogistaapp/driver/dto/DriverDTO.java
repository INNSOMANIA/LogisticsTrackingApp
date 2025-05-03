package com.arcode.arlogistaapp.driver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import static java.util.Objects.isNull;

@Getter
@Setter
@NoArgsConstructor(force = true)
public class DriverDTO implements Serializable {
    private static final long serialVersionUID = 222L;
    private final long id;
    private final String name;
    private final String surname;
    private final String email;
    private final String address;
    private final String lisence;
    private final Long phone;

    public DriverDTO(long id, String name, String surname, String email, String address, String licence, Long phone) {
        this.id =id;
        this.name = name;
        this.surname = surname;
        this.phone = isNull(phone) ? 0 : phone;
        this.email = email;
        this.address = address;
        this.lisence = licence;
    }
}
