package org.educa.dao;

import org.educa.entity.PedidoEntity;
import org.hibernate.Session;

public class PedidoDAOImpl implements PedidoDAO {
    @Override
    public PedidoEntity findByID(Integer id, Session session) {
        return session.get(PedidoEntity.class, id);
    }
}
