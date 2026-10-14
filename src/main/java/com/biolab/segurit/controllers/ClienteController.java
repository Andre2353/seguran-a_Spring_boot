package com.biolab.segurit.controllers;

import com.biolab.segurit.dtos.ClienteDTO;
import com.biolab.segurit.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping // <-- ADICIONADO AQUI
    public ResponseEntity<?> criarCliente(@RequestBody ClienteDTO dto) {
        return ResponseEntity.ok(clienteService.criarCliente(dto));
    }
    @GetMapping
    public ResponseEntity<?> ola(){
        return ResponseEntity.ok("ola");
    }
}