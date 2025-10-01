package com.safa.modasluz.dto;

import com.safa.modasluz.modelos.Cliente;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class PedidoPostDTO {
    private Cliente cliente;
    private Double precio;
    private Timestamp fecha;
}
