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
@Table(name = "inventario",catalog = "postgres", schema = "modas_luz")
public class Inventario {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "id_producto")
    @ManyToOne
    private Producto producto;

    @JoinColumn(name = "id_talla")
    @ManyToOne
    private Talla talla;

    @Column(name = "cantidad")
    private Integer cantidad;
}
