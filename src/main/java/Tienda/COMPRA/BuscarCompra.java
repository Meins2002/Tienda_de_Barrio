package Tienda.COMPRA;

import Tienda.ADMINISTRACION.Administracion;

import java.util.Optional;
import java.util.Scanner;

public class BuscarCompra {

    public void buscar_Compra(Administracion administracion) {

        System.out.println("INGRESA EL CODIGO DE LA COMPRA A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String idCompra = scanner.next();
        scanner.nextLine();

        Optional<Compra> compraOptional = administracion.buscarCompra(idCompra);
        if (compraOptional.isPresent()) {
            System.out.println(compraOptional.get());
        } else {
            System.out.println("Producto con eL ID: " + idCompra + " no encontrado");
        }

    }
}
