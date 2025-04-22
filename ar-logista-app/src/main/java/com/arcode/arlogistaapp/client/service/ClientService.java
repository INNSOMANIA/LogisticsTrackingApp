package com.arcode.arlogistaapp.client.service;

import com.arcode.arlogistaapp.client.dto.ClientDTO;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientService {
    ClientDTO getClient(long clientId) throws Exception;

    List<ClientDTO> getClientList();

    void addClient(ClientDTO clientDTO);

    void deleteClient(long clientId) throws Exception;
}
