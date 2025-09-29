package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IInventarioRepository extends JpaRepository<Inventario, Integer> {
}
