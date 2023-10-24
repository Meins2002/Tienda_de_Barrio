package Tienda;

import Tienda.Administracion;
import Tienda.Compra;
import Tienda.Producto;
import Tienda.Venta;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Administracion administracion = new Administracion();
        int opciones = ejecutarMenu();
        while (opciones != 7){
            switch (opciones) {
                case 1 :
                    crearProducto(administracion);
                    break;
                case 2 :
                    modificarProducto(administracion);
                    break;
                case 3 :
                    consultarProducto(administracion);
                    break;
                case 4 :
                    agregarCompra(administracion);
                    break;
                case 5 :
                    modificarCompra(administracion);
                    break;
                case 6 :
                    buscarCompra(administracion);
                    break;
                case 7 :
                    agregarVenta(administracion);
                case 8 :
                    modificarCompra(administracion);
                    break;
                case 9 :
                    buscarVenta(administracion);
                    break;
                case 10 :
                    System.out.println("Saliendo de menú ");
                    break;
            }
            opciones = ejecutarMenu();
        }

    }


    public static void crearProducto(Administracion administracion)
    {
        //REGISTRAR NUEVO PRODUCTO
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO : ");
        String codigoProducto = scanner.nextLine();


        System.out.println("INGRESA EL NOMBRE DEL PRODUCTO: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("INGRESA  LA MARCA DEL PRODUCTO: ");
        String marcaProducto =  scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE EMPAQUE DEL PRODUCTO: ");
        String tipoEmpaque = scanner.nextLine();

        System.out.println("INGRESA LA MEDIDA DEL PRODUCTO: ");
        Double medidaProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE MEDIDA DEL PRODUCTO: ");
        String tipoMedidaProducto = scanner.nextLine();

        System.out.println("INGRESA LA ETIQUETA DEL PRODUCTO: ");
        String etiquetaProducto=  scanner.nextLine();

        System.out.println("INGRESA  LA CATEGORIA DEL PRODUCTO : ");
        String  categoriaProducto =  scanner.nextLine();

        System.out.println("INGRESA LA CANTIDAD DEL PRODUCTO: ");
        Double cantidadProducto = scanner.nextDouble();
        scanner.nextLine();
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());

    }

    public static void modificarProducto(Administracion administracion)
    {
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

    /*public static void eliminarProducto( Administracion administracion)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO : ");
        Integer codigoProducto = scanner.nextInt();
         Producto producto = new Producto(producto.getCodigoProducto()) {
        };
        producto.eliminarProducto(codigoProducto);
        System.out.println(producto.toString());


    }*/
    public static void  consultarProducto(Administracion administracion)
    {
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
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

    public static void agregarCompra(Administracion administracion){

    }
    public static void modificarCompra(Administracion administracion){

    }
    public static void buscarCompra(Administracion administracion){

    }
    public static void agregarVenta(Administracion administracion){

    }
    public static void modificarVenta(Administracion administracion){

    }
    public static void buscarVenta(Administracion administracion){

    }
    public static int ejecutarMenu()
    {
        System.out.println("|o|   B        /////////////\\\\\\\\s\\s   |o|");
        System.out.println("|o|   I      (((((((((((((   \\\\\\\\.\\s  |o|");
        System.out.println("|o|   E        ))) ~~      ~~   (((   |o|");
        System.out.println("|o|   N        ((( (*)     (*)  )))   |o|");
        System.out.println("|o|   V        )))     <        (((\\s |o|");
        System.out.println("|o|   E        (((  |______/`   )))\\s |o|");
        System.out.println("|o|   N        )))\\\\___________/(((   |o|");
        System.out.println("|o|   I        (((   _)  (_    )))\\s  |o|");
        System.out.println("|o|   D            /\\\\__/\\\\           |o|");
        System.out.println("|o|   O                               |o|");
        System.out.println("|o|   S                               |o|");
        System.out.println(" ");

        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("******************************************");
        System.out.println("*   Administrador Mi Tienda de Barrio    *");
        System.out.println("******************************************");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Modificar producto                    |");
        System.out.println("3. Buscar productos                      |");
        System.out.println("4. Agregar Compra                        |");
        System.out.println("5. Modificar Compra                      |");
        System.out.println("6. Buscar Compra                         |");
        System.out.println("7. Agregar venta                         |");
        System.out.println("8. Buscar venta                          |");
        System.out.println("9. Modificar venta                       |");
        System.out.println("10.Salir menú                            |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 10)  ");

        Scanner scanner = new Scanner(System.in);
        int opciones =10;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 10 )
            {
                System.out.println("La opcion seleccionada no es válida");
                ejecutarMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opcion seleccionada no es válida");
            ejecutarMenu();
        }
        return opciones;
    }

}




