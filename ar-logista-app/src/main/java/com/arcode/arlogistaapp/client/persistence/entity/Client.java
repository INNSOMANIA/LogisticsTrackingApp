package com.arcode.arlogistaapp.client.persistence.entity;

import javax.persistence.*;

import lombok.*;

@Table(name = "client")
@Entity
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = false)
    private Long phone;
}
