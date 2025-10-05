package com.safa.modasluz.repositorios;

import com.safa.modasluz.modelos.Talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ITallaRepository extends JpaRepository<Talla, Integer> {

}
