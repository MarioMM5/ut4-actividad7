package org.educa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "pedido")
@Data
public class PedidoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "id_cliente")
    private ClienteEntity cliente;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "id_direccion")
    private DireccionEntity direccion;
}
