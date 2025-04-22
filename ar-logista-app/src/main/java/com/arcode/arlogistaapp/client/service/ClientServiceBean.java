package com.arcode.arlogistaapp.client.service;

import com.arcode.arlogistaapp.client.dto.ClientDTO;
import com.arcode.arlogistaapp.client.persistence.db.ClientRepository;
import com.arcode.arlogistaapp.client.persistence.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientServiceBean implements ClientService {

    private final ClientRepository<Client> clientRepository;

    @Override
    public ClientDTO getClient(long clientId) throws Exception {
        Optional<Client> clientOptional = clientRepository.findById(clientId);
        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            return new ClientDTO(
                    client.getId(),
                    client.getCompany(),
                    client.getTax(),
                    client.getAddress(),
                    client.getPhone());
        } else {
            throw new Exception("Client is not found in the system");
        }
    }

    @Override
    public List<ClientDTO> getClientList() {
        return clientRepository.findAll().stream()
                .map(
                        client ->
                                new ClientDTO(
                                        client.getId(),
                                        client.getCompany(),
                                        client.getTax(),
                                        client.getAddress(),
                                        client.getPhone()))
                .collect(Collectors.toList());
    }

    @Override
    public void addClient(ClientDTO clientDTO) {
        final Client client =
                Client.builder()
                        .id(clientDTO.getId())
                        .company(clientDTO.getCompany())
                        .tax(clientDTO.getTax())
                        .address(clientDTO.getAddress())
                        .phone(clientDTO.getPhone())
                        .build();

        clientRepository.save(client);
    }

    @Override
    public void deleteClient(long clientId) throws Exception {
        final Optional<Client> possibleClient = clientRepository.findById(clientId);
        if (possibleClient.isPresent()) {
            final Client client = possibleClient.get();
            clientRepository.delete(client);
        } else {
            throw new Exception("Client with id " + clientId + " does not exist.");
        }
    }
}
