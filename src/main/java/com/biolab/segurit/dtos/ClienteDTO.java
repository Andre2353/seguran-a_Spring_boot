package com.biolab.segurit.dtos;

import com.biolab.segurit.entitiy.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private Role role;

    // Construtor sem ID (ajustado para nome vir antes de email)
    public ClienteDTO(String nome, String email, String senha, Role role) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
    }
}