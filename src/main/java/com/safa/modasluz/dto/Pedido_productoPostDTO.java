package com.safa.modasluz.dto;

import com.safa.modasluz.modelos.Pedido;
import com.safa.modasluz.modelos.Producto;
import com.safa.modasluz.modelos.Talla;
import lombok.Data;

@Data
public class Pedido_productoPostDTO {
    private Producto producto;
    private Talla talla;
    private Pedido pedido;
    private Integer cantidad;
}
