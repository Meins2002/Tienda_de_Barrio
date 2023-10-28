package Tienda;

import Tienda.Administracion;
import Tienda.Compra;
import Tienda.Producto;
import Tienda.Venta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Administracion administracion = new Administracion();
        int opciones = ejecutarMenu();
        while (opciones != 7){
            switch (opciones) {
                case 1 :
                    agregarProducto(administracion);
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
                    modificarVenta(administracion);
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

    //funcion
    public static void agregarProducto(Administracion administracion)
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

        System.out.println("INGRESA UNIDAD DE MEDIDA DEL PRODUCTO: ");
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

        //nuevo objeto
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,
                                            tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA  LA FECHA DE LA COMPRA (yyyy-MM-dd):");
        String fechaCompraStr =  scanner.nextLine();
        System.out.println("INGRESA EL CODIGO DE LA COMPRA : ");
        String idCompra = scanner.nextLine();
        System.out.println("INGRESA EL NIT DEL PROVEEDOR : ");
        int nitProveedor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR: ");
        String nombreProveedor = scanner.nextLine();
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A COMPRAR: ");
        String codigoProducto = scanner.nextLine();


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaCompra = null;

        try {
            fechaCompra = dateFormat.parse(fechaCompraStr);
        } catch (ParseException e) {
            System.out.println("Fecha de compra no válida. Utiliza el formato yyyy-MM-dd.");
            return;
        }

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto );
        if (productoOptional.isPresent() ) {
            Producto productosCompra = productoOptional.get();
            System.out.println(productosCompra.getNombreProducto());

            System.out.println("INGRESA EL VALOR UNITARIO DEl PRODUCTO: ");
            Double valorUnitario = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("INGRESA LA CANTIDAD A COMPRAR : ");
            double cantidad= scanner.nextInt();
            scanner.nextLine();
            productosCompra.setCantidadProducto(productosCompra.getCantidadProducto() + cantidad);
            double valorTotal = valorUnitario * cantidad;

            Compra compra = new Compra(idCompra,nombreProveedor,fechaCompra,valorUnitario,valorTotal,
                    nitProveedor, Optional.of(productosCompra), cantidad);
            administracion.agregarCompra(compra);
            System.out.println(compra.toString());

        } else {
            System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }


    }
    public static void modificarCompra(Administracion administracion){
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


    public static void buscarCompra(Administracion administracion){

        System.out.println("INGRESA EL CODIGO DE LA COMPRA A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String idCompra = scanner.next();
        scanner.nextLine();

        Optional<Compra> compraOptional = administracion.buscarCompra(idCompra);
        if (compraOptional.isPresent()) {
            System.out.println(compraOptional.get());
        } else {
            System.out.println("Producto con eL ID: " + idCompra  + " no encontrado");
        }

    }
    public static void agregarVenta(Administracion administracion){

    }
    public static void modificarVenta(Administracion administracion){

    }
    public static void buscarVenta(Administracion administracion){

    }
    public static int ejecutarMenu()
    {
        System.out.println("|o||o|o||o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|");
        System.out.println("|o|                                   |o|");
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
        System.out.println("|o|                                   |o|");
        System.out.println("|o||o|o||o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|o|");

        System.out.println("  ");
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("******************************************");
        System.out.println("*   Administrador Mi Tienda de Barrio    *");
        System.out.println("******************************************");
        System.out.println("*   1. Agregar producto                  *");
        System.out.println("*   2. Modificar producto                *");
        System.out.println("*   3. Buscar productos                  *");
        System.out.println("*   4. Agregar Compra                    *");
        System.out.println("*   5. Modificar Compra                  *");
        System.out.println("*   6. Buscar Compra                     *");
        System.out.println("*   7. Agregar venta                     *");
        System.out.println("*   8. Buscar venta                      *");
        System.out.println("*   9. Modificar venta                   *");
        System.out.println("*  10.Salir menú                         *");
        System.out.println("******************************************");
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




