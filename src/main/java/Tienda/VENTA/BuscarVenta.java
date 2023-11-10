package Tienda.VENTA;

import Tienda.ADMINISTRACION.Administracion;
import Tienda.PRODUCTO.Producto;

import java.util.Optional;
import java.util.Scanner;

public class BuscarVenta {

    public void buscar_Venta(Administracion administracion){
        System.out.println("******************************************");
        System.out.println("* 8. BUSCAR VENTA:                       *");
        System.out.println("******************************************");
        System.out.print("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String idVenta = scanner.next();
        scanner.nextLine();

        Optional<Venta> ventaOptional = administracion.buscarVenta(idVenta );
        if (ventaOptional.isPresent()) {
            System.out.println(ventaOptional.get());
        } else {
            System.out.println("Producto con eL ID: " + idVenta  + " no encontrado");
        }
    }
}
