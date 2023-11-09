package Tienda.PRODUCTO;

import Tienda.ADMINISTRACION.Administracion;

import java.util.Optional;
import java.util.Scanner;

public class ConsultarProducto {

    public void consultar_Producto(Administracion administracion){
        System.out.println("******************************************");
        System.out.println("* 3. CONSULTAR PRODUCTO:                 *");
        System.out.println("******************************************");
        System.out.print("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
         String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto );
        if (productoOptional.isPresent()) {
             System.out.println(productoOptional.get());
        } else {
        System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }
    }

}
