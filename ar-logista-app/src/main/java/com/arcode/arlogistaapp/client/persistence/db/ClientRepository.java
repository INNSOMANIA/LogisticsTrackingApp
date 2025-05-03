package com.arcode.arlogistaapp.client.persistence.db;

import com.arcode.arlogistaapp.client.persistence.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository<T extends Client>  extends JpaRepository<Client , Long> {

    Optional<Client> findById(Long clientId);

    List<Client> findAll();
}
