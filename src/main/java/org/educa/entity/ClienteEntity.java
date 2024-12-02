package org.educa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "cliente")
@Data
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String pass;
    private String dni;
    private String nombre;
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    private String telefono;
    @Column(name = "usu_cre")
    private String usuCre;
    @Column(name = "fec_cre")
    private Timestamp fecCre;
    @Column(name = "usu_mod")
    private String usuMod;
    @Column(name = "fec_mod")
    private Timestamp fecMod;

    @OneToMany(mappedBy = "direccion")
    private List<DireccionEntity> direcciones;
}
