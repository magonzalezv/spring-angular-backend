package com.imcoding.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imcoding.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
