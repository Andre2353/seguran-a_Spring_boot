package com.biolab.segurit.service;

import com.biolab.segurit.dtos.ClienteDTO;
import com.biolab.segurit.entitiy.Cliente;
import com.biolab.segurit.entitiy.Role;
import com.biolab.segurit.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO criarCliente(ClienteDTO request) {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getNome());
        cliente.setEmail(request.getEmail());
        cliente.setSenha(request.getSenha());

        if (request.getRole() == null) {
            cliente.setRole(Role.USER);
        } else {
            cliente.setRole(request.getRole());
        }

        Cliente clienteSalvo = clienteRepository.save(cliente);

        return new ClienteDTO(
                clienteSalvo.getId(),
                clienteSalvo.getNome(),
                clienteSalvo.getEmail(),
                clienteSalvo.getSenha(),
                clienteSalvo.getRole()
        );
    }
}