package com.safa.modasluz.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "pedido",catalog = "postgres", schema = "modas_luz")
public class Pedido {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "id_cliente")
    @ManyToOne
    private Cliente cliente;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "fecha")
    private Timestamp fecha;
}
