package com.safa.modasluz.dto;

import com.safa.modasluz.modelos.Color;
import com.safa.modasluz.modelos.Tipo;
import lombok.Data;

@Data
public class ProductoPostDTO {
    private Tipo tipo;
    private String descripcion;
    private Color color;
    private Double precio;
}
