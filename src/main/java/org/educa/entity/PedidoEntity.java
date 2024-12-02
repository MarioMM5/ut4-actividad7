package org.educa.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "pedido")
@Data
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private ClienteEntity cliente;
    @OneToOne
    @PrimaryKeyJoinColumn
    private DireccionEntity direccion;
}
