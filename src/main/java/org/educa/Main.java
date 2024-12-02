package org.educa;

import org.educa.entity.PedidoEntity;
import org.educa.service.PedidoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Introduce el id del pedido:");
            Integer id = sc.nextInt();
            sc.nextLine();
            PedidoService pedidoService = new PedidoService();
            PedidoEntity pedido = pedidoService.findByID(id);
            System.out.printf("Pedido (%d) hecho por el Sr. %s %s, %s. En la dirección con calle: %s %n", pedido.getId(),
                    pedido.getCliente().getPrimerApellido(),
                    pedido.getCliente().getSegundoApellido(),
                    pedido.getCliente().getNombre(),
                    pedido.getDireccion().getCalle());
        }
    }
}