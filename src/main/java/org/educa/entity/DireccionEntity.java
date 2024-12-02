package org.educa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
@Entity
@Table(name = "direccion")
@Data
public class DireccionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String calle;
    private String ciudad;
    private String cp;
    private String pais;

    @Column(name = "usu_cre")
    private String usuCre;
    @Column(name = "fec_cre")
    private Timestamp fecCre;
    @Column(name = "usu_mod")
    private String usuMod;
    @Column(name = "fec_mod")
    private Timestamp fecMod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="id_cliente")
    private ClienteEntity cliente;
}
