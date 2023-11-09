package Tienda.VENTA;

import Tienda.ADMINISTRACION.Administracion;
import Tienda.VENTA.Venta;

import java.util.Optional;
import java.util.Scanner;

public class ModificarVenta {

        public void modificar_Venta (Administracion administracion) {
            System.out.println("INGRESA EL ID DE LA VENTA : ");
            Scanner scanner = new Scanner(System.in);
            String codigoVenta = scanner.nextLine();

            Optional<Venta> ventaEncontrada = administracion.buscarVenta(codigoVenta);

            if (ventaEncontrada.isPresent()) {
                Venta venta = ventaEncontrada.get();
                System.out.println("Id de venta encontrada:");
                System.out.println(venta);


                if (ventaEncontrada.isPresent()) {
                    System.out.println("Seleccione el campo de la compra  que deseas modificar: ");

                    System.out.println("1. Cantidad del Producto");
                    System.out.println("2. Valor del Producto");
                    System.out.println("3. Eliminar venta");

                    int opcion = scanner.nextInt();

                    String nuevoValor = scanner.nextLine();

                    Optional<Venta> ventaModificada = administracion.modificarVenta(codigoVenta,
                            opcion, nuevoValor);

                    if (ventaModificada.isPresent()) {
                        System.out.println("Producto modificado exitosamente.");
                        System.out.println(ventaEncontrada.get());
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

