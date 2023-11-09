package Tienda.COMPRA;

import Tienda.ADMINISTRACION.Administracion;
import Tienda.PRODUCTO.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class AgregarCompra {
    public void agregar_Compra(Administracion administracion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESA  LA FECHA DE LA COMPRA (yyyy-MM-dd):");
        String fechaCompraStr = scanner.nextLine();
        System.out.print("INGRESA EL CODIGO DE LA COMPRA : ");
        String idCompra = scanner.nextLine();
        System.out.print("INGRESA EL NIT DEL PROVEEDOR : ");
        int nitProveedor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("INGRESA EL NOMBRE DEL PROVEEDOR: ");
        String nombreProveedor = scanner.nextLine();
        System.out.print("INGRESA EL CODIGO DEL PRODUCTO A COMPRAR: ");
        String codigoProducto = scanner.nextLine();


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaCompra = null;

        try {
            fechaCompra = dateFormat.parse(fechaCompraStr);
        } catch (
                ParseException e) {
            System.out.println("Fecha de compra no válida. Utiliza el formato yyyy-MM-dd.");
            return;
        }

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto);
        if (productoOptional.isPresent()) {
            Producto productosCompra = productoOptional.get();
            System.out.println(productosCompra.getNombreProducto());

            System.out.print("INGRESA EL VALOR UNITARIO DEl PRODUCTO: ");
            Double valorUnitario = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("INGRESA LA CANTIDAD A COMPRAR : ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine();


            productosCompra.setCantidadProducto(productosCompra.getCantidadProducto() + cantidad);
            double valorTotal = valorUnitario * cantidad;

            Compra compra = new Compra(idCompra, nombreProveedor, fechaCompra, valorUnitario, valorTotal,
                    nitProveedor, Optional.of(productosCompra), cantidad);
            administracion.agregarCompra(compra);
            System.out.println(compra.toString());

        } else {
            System.out.println("Producto con eL ID: " + codigoProducto + " no encontrado");
        }

    }
}
