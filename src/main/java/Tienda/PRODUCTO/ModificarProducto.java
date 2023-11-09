package Tienda.PRODUCTO;
import Tienda.ADMINISTRACION.Administracion;

import java.util.Optional;
import java.util.Scanner;

public class ModificarProducto {

    public void modificar_Producto(Administracion administracion) {
        System.out.println("******************************************");
        System.out.println("* 2. MODIFICAR PRODUCTO:                 *");
        System.out.println("******************************************");
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoEncontrado = administracion.buscarProducto(codigoProducto);

        if (productoEncontrado.isPresent()) {
            System.out.println("******************************************");
            System.out.println("Seleccione el campo del producto " + "\n" +
                    "que desee modificar: ");
            System.out.println("******************************************");
            System.out.println("  1. Nombre del Producto");
            System.out.println("  2. Marca del Producto");
            System.out.println("  3. Tipo de Empaque");
            System.out.println("  4. Medida");
            System.out.println("  5. Tipo de medida");
            System.out.println("  6. Etiqueta Producto");
            System.out.println("  7. Categoria Producto");
            System.out.println("  8. Cantidad");
            System.out.println("******************************************");

            System.out.print("Opción:  ");
            String Opcion = scanner.nextLine();

            //Actualizacion
            //System.out.println("Modificar Producto: " );

            switch (Opcion ) {
                case "1":
                    System.out.println("  1. Cambiar nombre del producto: ");
                    break;
                case "2":
                    System.out.println("  2. Cambiar Marca del Producto: ");
                    break;
                case "3":
                    System.out.println("  3. Cambiar Tipo de Empaque: ");
                    break;
                case "4":
                    System.out.println("  4. Cambiar Medida: ");
                    break;
                case "5":
                    System.out.println("  5. Cambiar Tipo de Medida: ");
                    break;
                case "6":
                    System.out.println("  6. Cambiar Etiqueta Producto: ");
                    break;
                case "7":
                    System.out.println("  7. Cambiar Categoria Producto: ");
                    break;
                case "8":
                    System.out.println("  8. Cambiar Cantidad: ");
                    break;
                default:
                    System.out.println("  Opción no valida");
                    return;
            }
            String nuevoValor = scanner.nextLine();
            Optional<Producto> productoModificado = administracion.modificarProducto(
                        codigoProducto, Opcion, nuevoValor);

            if (productoModificado.isPresent()) {
                System.out.println("Producto modificado exitosamente.");
                System.out.println("******************************************");
                System.out.println(" ");
            } else {
                System.out.println("No se pudo modificar el producto.");
                System.out.println(" ");
            }
        } else {
            System.out.println("Producto no encontrado.");
            System.out.println(" ");
        }

    }
}
