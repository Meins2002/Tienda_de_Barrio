package Tienda;

import Tienda.ADMINISTRACION.Administracion;
import Tienda.COMPRA.AgregarCompra;
import Tienda.COMPRA.BuscarCompra;
import Tienda.COMPRA.Compra;
import Tienda.COMPRA.ModificarCompra;
import Tienda.PRODUCTO.AgregarProducto;
import Tienda.PRODUCTO.ConsultarProducto;
import Tienda.PRODUCTO.ModificarProducto;
import Tienda.PRODUCTO.Producto;
import Tienda.VENTA.AgregarVenta;
import Tienda.VENTA.Venta;

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
        while (opciones != 10){
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
                    break;
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
        //Llamar clase | instancia
        AgregarProducto productoAgregado = new AgregarProducto();
        //instancia     | llamar metodo de la clase
        productoAgregado.agregar_Producto(administracion);

    }

    //Instancia
    //                |   Metodo      |Parametros
    public static void agregarProducto(Administracion administracion){
        //Llamar clase | instancia
        AgregarProducto agregarProducto = new AgregarProducto();
        //Instancia    | llamar metodo de la clase
        agregarProducto.agregar_Producto(administracion);
    }


    public static void modificarProducto(Administracion administracion) {
        //  Llamar Clase | Instancia
        ModificarProducto modificarProducto = new ModificarProducto();
        //  Instancia    | Llamar metodo de la clase
        modificarProducto.modificar_Producto(administracion);

    }

    public static void  consultarProducto(Administracion administracion) {
        //  Llamar Clase | Instancia
        ConsultarProducto consultarProducto = new ConsultarProducto();
        //  Instancia    | Llamar metodo de la clase
        consultarProducto.consultar_Producto(administracion);
    }

    public static void agregarCompra(Administracion administracion){
        //Llamar Clase | Instancia
        AgregarCompra   agregarCompra = new AgregarCompra();
        //Instancia  | Llamar metodo de la clase
        agregarCompra.agregar_Compra(administracion);
    }

    public static void modificarCompra(Administracion administracion){
        //Llamar Clase | Instancia
        ModificarCompra modificarCompra = new ModificarCompra();
        //Instancia    | Llamar metodo de la clase
        modificarCompra.modificar_Compra(administracion);
    }

    public static void buscarCompra(Administracion administracion){
        //Llamar Clase | Instancia
        BuscarCompra     buscarCompra = new BuscarCompra();
        //Instancia | Llamar metodo de la clase
        buscarCompra.buscar_Compra(administracion);
    }
    public static void agregarVenta (Administracion administracion){

        AgregarVenta agregarVenta = new AgregarVenta();
        agregarVenta.agregar_Venta(administracion);

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




