package com.arcode.arlogistaapp.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private final long id;
    private final String company;
    private final String tax;
    private final Long phone;
    private final String address;

    public ClientDTO(long id, String company, String tax, String address, long phone) {
        this.id = id;
        this.company = company;
        this.tax = tax;
        this.address = address;
        this.phone = phone;
    }
}
