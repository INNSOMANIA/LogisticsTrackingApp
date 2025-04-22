package com.arcode.arlogistaapp.client.persistence.entity;

import javax.persistence.*;

import lombok.*;

@Table(name = "client")
@Entity
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_seq")
    @SequenceGenerator(name = "client_id_seq", allocationSize = 1, sequenceName = "client_id_seq")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "tax", nullable = false)
    private String tax;

    @Column(name = "phone", nullable = false)
    private long phone;

    @Column(name = "address", nullable = false)
    private String address;

    public Client(long id, String company, String tax, String address, long phone) {
        this.id = id;
        this.company = company;
        this.tax = tax;
        this.address = address;
        this.phone = phone;
    }
}
