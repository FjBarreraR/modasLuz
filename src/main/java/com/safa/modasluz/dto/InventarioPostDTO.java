package com.safa.modasluz.dto;

import com.safa.modasluz.modelos.Producto;
import com.safa.modasluz.modelos.Talla;
import lombok.Data;

@Data
public class InventarioPostDTO {
    private Producto producto;
    private Talla talla;
    private Integer cantidad;
}
