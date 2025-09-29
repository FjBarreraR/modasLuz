package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
