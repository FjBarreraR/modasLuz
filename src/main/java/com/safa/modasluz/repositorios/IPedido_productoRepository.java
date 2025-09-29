package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Pedido_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPedido_productoRepository extends JpaRepository<Pedido_producto, Integer> {
}
