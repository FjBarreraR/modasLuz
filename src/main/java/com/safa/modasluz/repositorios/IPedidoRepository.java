package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
}
