package com.biolab.segurit.repository;

import com.biolab.segurit.entitiy.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Cliente findByEmail(String email);
}
