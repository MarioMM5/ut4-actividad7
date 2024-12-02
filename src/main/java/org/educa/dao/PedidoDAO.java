package org.educa.dao;

import org.educa.entity.PedidoEntity;
import org.hibernate.Session;

public interface PedidoDAO {
    PedidoEntity findByID(Integer id, Session session);
}
