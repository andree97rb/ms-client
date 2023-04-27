package com.richand.bank1.msclient.contoller;

import com.richand.bank1.msclient.entity.Client;
import com.richand.bank1.msclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ms-client")
public class ClientController {
    @Autowired
    ClientService clientServices;

    @GetMapping("/clients")
    public Flux<Client> findAll(){
        return clientServices.findAll();
    }

    @GetMapping("/clients/{id}")
    public Mono<Client> findById(@PathVariable  Long id){
        return clientServices.findById(id);
    }

    @PostMapping()
    public Mono<Client> create(@RequestBody Client client){
        return clientServices.create(client);
    }
}
