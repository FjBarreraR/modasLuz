package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
