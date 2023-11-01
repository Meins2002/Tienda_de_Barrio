package Tienda.PRODUCTO;
import Tienda.ADMINISTRACION.Administracion;

import java.util.Optional;
import java.util.Scanner;

public class ModificarProducto {

    public void modificar_Producto(Administracion administracion) {
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoEncontrado = administracion.buscarProducto(codigoProducto);

        if (productoEncontrado.isPresent()) {
            System.out.println("Seleccione el campo del producto que desee modificar: ");
            System.out.println("1. Nombre del Producto");
            System.out.println("2. Marca del Producto");
            System.out.println("3. Tipo de Empaque");
            System.out.println("4. Medida");
            System.out.println("5. Tipo de medida");
            System.out.println("6. Etiqueta Producto");
            System.out.println("7. Categoria Producto");
            System.out.println("8. Cantidad");


            String opcion = scanner.nextLine();
            //Actualizacion
            System.out.println("Modificar Producto: ");

            String nuevoValor = scanner.nextLine();

            Optional<Producto> productoModificado = administracion.modificarProducto(
                    codigoProducto,
                    opcion,
                    nuevoValor
            );

            if (productoModificado.isPresent()) {
                System.out.println("Producto modificado exitosamente.");
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
