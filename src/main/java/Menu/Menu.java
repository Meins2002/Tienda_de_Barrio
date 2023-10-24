package Menu;

//Menu_de_opciones_Mi_tienda_de_barrio
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Menu Menu = new Menu();

        Menu.ejecutarMenu();
    }
    public void  Mostrar_Menu (){


        Scanner Teclado = new Scanner(System.in);

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

        System.out.println("******************************************");
        System.out.println("*   Administrador Mi Tienda de Barrio    *");
        System.out.println("******************************************");
        System.out.println("*                                        *");
        System.out.println("*  Opciones de menú :                    *");
        System.out.println("*                                        *");
        System.out.println("*  1. Agregar producto                   *");
        System.out.println("*  2. Actualizar producto                *");
        System.out.println("*  3. Eliminar producto                  *");
        System.out.println("+  4. Consultar productos                *");
        System.out.println("*  5. Reporte Inventario                 *");
        System.out.println("*  6. Movimiento inventario              *");
        System.out.println("*  7. Salir menú                         *");
        System.out.println("******************************************");
        System.out.print("Ingresa tu opción:  ");

    }
    public  void seleccionarMenu(int opciones)
    {
        switch (opciones) {
            case 1 :
                agregarProducto();
                break;
            case 2 :
                actualizarProducto();
                break;
            case 3 :
                eliminarProducto();
                break;
            case 4 :
                consultarProducto();
                break;
            case 5 :
                reporteInventario();
                break;
            case 6 :
                movimientoInventario();
                break;
            case 7 :
                salirMenu();
                break;
            default :
                System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }
    }
    public void agregarProducto()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada Agregar");
    }
    public void actualizarProducto()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada Actualizar");

    }
    public void eliminarProducto()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada Eliminar");
    }
    public void consultarProducto()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada consultar");
    }
    public void reporteInventario()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada reporte");
    }
    public void movimientoInventario ()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada Movimiento");
    }
    public void salirMenu ()
    {
        System.out.println("******************************************");
        System.out.println("Funcion seleccionada Salir...");
    }

    public void ejecutarMenu()
    {
        int opciones;
        Scanner  Teclado = new Scanner(System.in);
        do {
            Mostrar_Menu();
            opciones = Teclado.nextInt();
            Teclado.nextLine();
            seleccionarMenu(opciones);

        }while (opciones != 7);
    }

}

