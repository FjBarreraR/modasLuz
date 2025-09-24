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
@Table(name = "cliente",catalog = "postgres", schema = "modas_luz")

public class Cliente {
    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "contrasenya")
    private String contrasenya;
}
