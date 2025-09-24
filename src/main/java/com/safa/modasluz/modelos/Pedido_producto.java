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
@Table(name = "pedido_producto",catalog = "postgres", schema = "modas_luz")
public class Pedido_producto {
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

    @JoinColumn(name = "id_pedido")
    @ManyToOne
    private Pedido pedido;

    @Column(name = "cantidad")
    private Integer cantidad;
}
