package com.arcode.arlogistaapp.client.dto;

import lombok.*;

import java.io.Serializable;

import static java.util.Objects.isNull;

@Getter
@Setter
@NoArgsConstructor(force = true)
public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 111L;
    private final long id;
    private final String company;
    private final String tax;
    private final Long phone;
    private final String address;

    public ClientDTO(long id, String company, String tax, Long phone, String address) {
        this.id = id;
        this.company = company;
        this.tax = tax;
        this.phone = isNull(phone) ? 0 : phone;
        this.address = address;
    }
}
