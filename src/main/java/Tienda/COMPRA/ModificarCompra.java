package Tienda.COMPRA;

import Tienda.ADMINISTRACION.Administracion;

import java.util.Optional;
import java.util.Scanner;

public class ModificarCompra {

    public void modificar_Compra(Administracion administracion) {
        System.out.println("INGRESA EL CODIGO DE LA COMPRA A MODIFICAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoCompra = scanner.nextLine();

        Optional<Compra> compraEncontrada = administracion.buscarCompra(codigoCompra);

        if (compraEncontrada.isPresent()) {
            Compra compra = compraEncontrada.get();
            System.out.println("Compra encontrada:");
            System.out.println(compra);


            if (compraEncontrada.isPresent()) {
                System.out.println("Seleccione el campo de la compra  que deseas modificar: ");

                System.out.println("1. Nombre del Proveedor");
                System.out.println("2. Nit del Proveedor");
                System.out.println("3. Producto, cantidad y valor unitario");

                int opcion = scanner.nextInt();

                String nuevoValor = scanner.nextLine();

                Optional<Compra> compramodificada = administracion.modificarCompra(codigoCompra, opcion, nuevoValor);

                if (compramodificada.isPresent()) {
                    System.out.println("Producto modificado exitosamente.");
                    System.out.println(compraEncontrada.get());
                } else {
                    System.out.println("No se pudo modificar el producto.");
                }

            } else {
                System.out.println("Producto no encontrado.");
                System.out.println(" ");
            }
        }
    }
}