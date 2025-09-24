package com.safa.modasluz.modelos;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "producto",catalog = "postgres", schema = "modas_luz")
public class Producto {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipo")
    @Enumerated(EnumType.ORDINAL)
    private Tipo tipo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "color")
    @Enumerated(EnumType.ORDINAL)
    private Color color;

    @Column(name = "precio")
    private Integer precio;
}
