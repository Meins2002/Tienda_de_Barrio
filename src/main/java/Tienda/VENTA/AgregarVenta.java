package Tienda.VENTA;

import Tienda.ADMINISTRACION.Administracion;
import Tienda.PRODUCTO.Producto;

import java.util.Optional;
import java.util.Scanner;

public class AgregarVenta {

    public void agregar_Venta(Administracion administracion) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("*            TIENDA DE BARRIO            *");
        System.out.println("******************************************");
        System.out.println("          DIRECCIÓN DE LA TIENDA");
        System.out.println("            NIT: 1 3239 903249");
        System.out.println("******************************************");

        System.out.println("                  ***                     ");
        System.out.println("FECHA DE VENTA (YYYY-MM-DD)");
        String fechaVenta = scanner.nextLine();
        System.out.print("HORA: ");
        String horaVenta = scanner.nextLine();
        System.out.print("ID VENTA: ");
        String idVenta = scanner.nextLine();
        System.out.println("CAJA: N/A "); //falta agregar
        System.out.println("                  ***                     ");
        System.out.println("******************************************");

        System.out.println("                  ***                     ");
        System.out.println("CLIENTE: "); //falta agregar
        System.out.println("DIRECCIÓN: "); //falta agregar
        System.out.println("TEL: ");//falta agregar
        System.out.println("IDENTIFICACIÓN: "); //falta agregar
        System.out.println("                  ***                     ");
        System.out.println("******************************************");

        System.out.println("                  ***                     ");
        System.out.print("CÓDIGO DE PRODUCTO: "); // clase producto
        String codigoProducto = scanner.nextLine();
        System.out.print("CANTIDAD DE PRODUCTO: "); //Clase producto
        Double cantidadVenta = scanner.nextDouble();
        System.out.print("VALOR DEL PRODUCTO: ");
        Double valorUnitario = scanner.nextDouble();
        System.out.print("IVA: ");
        Double ivaVenta = scanner.nextDouble();
        System.out.println("                  ***                     ");
        System.out.println("******************************************");
        System.out.println("                  ***                     ");
        double valorTotal = valorUnitario * cantidadVenta;
        System.out.println("VALOR NETO: " + valorTotal);
        Double totalVenta = valorTotal + (valorTotal * (ivaVenta / 100));
        System.out.println("VALOR TOTAL: " + totalVenta);

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto);

        if (productoOptional.isPresent()) {
            Producto ProductosVenta = productoOptional.get();


            Venta venta = new Venta(idVenta,valorUnitario,ivaVenta,valorTotal,fechaVenta,
                    horaVenta,cantidadVenta,Optional.of(ProductosVenta), totalVenta);

            administracion.agregarVenta(venta);

            System.out.println("Compra agregada con éxito:");
            System.out.println("                  ***                     ");
            System.out.println("******************************************");


            System.out.println(venta.toString());
        } else {
            System.out.println("Producto con el código " + codigoProducto + " no encontrado. " +
                    "No se pudo agregar la compra.");
        }
    }
}