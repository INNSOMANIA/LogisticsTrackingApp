package com.arcode.arlogistaapp.driver.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "driver")
@Entity
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    @Column(name = "id" , nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "driver_seq")
    @SequenceGenerator(name = "driver_seq", sequenceName = "driver_seq", allocationSize = 1)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname" , nullable = false)
    private String surname;

    @Column(name = "phone" , nullable = false)
    private Long phone;

    @Column(name = "email" , nullable = false)
    private String email;

    @Column(name = "address" , nullable = false)
    private String address;

    @Column(name = "licence" , nullable = false)
    private String licence;
}
