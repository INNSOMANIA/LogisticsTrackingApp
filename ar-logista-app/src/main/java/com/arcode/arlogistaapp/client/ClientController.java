package com.arcode.arlogistaapp.client;

import com.arcode.arlogistaapp.client.dto.ClientDTO;
import com.arcode.arlogistaapp.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/client")
public class ClientController {
    private final ClientService clientService;

    @GetMapping(value = "/{clientId}")
    public ClientDTO getClient(@PathVariable("clientId") long clientId) throws Exception {
        return clientService.getClient(clientId);
    }

    @GetMapping(value = "")
    public List<ClientDTO> getClientList() {
        return clientService.getClientList();
    }

    @PostMapping(value = "/add")
    public void addClient(@RequestBody ClientDTO clientDTO) {
        clientService.addClient(clientDTO);
    }

    @DeleteMapping(value = "/{clientId}/delete")
    public void deleteClient(@PathVariable("clientId") long clientId) throws Exception {
        clientService.deleteClient(clientId);
    }
}
