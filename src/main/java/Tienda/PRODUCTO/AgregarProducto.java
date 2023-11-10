package Tienda.PRODUCTO;
import Tienda.ADMINISTRACION.Administracion;
import java.util.Scanner;


// CLASE
public class AgregarProducto {

    //METODO
    public void agregar_Producto(Administracion administracion) {
        //REGISTRAR NUEVO PRODUCTO
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("*            TIENDA DE BARRIO            *");
        System.out.println("******************************************");
        System.out.println("* 1. AGREGAR PRODUCTO:                   *");
        System.out.println("******************************************");
        System.out.print("INGRESA EL CODIGO DEL PRODUCTO:");
        String codigoProducto = scanner.nextLine();

        System.out.print("INGRESA EL NOMBRE DEL PRODUCTO: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("INGRESA  LA MARCA DEL PRODUCTO: ");
        String marcaProducto = scanner.nextLine();

        System.out.print("INGRESA EL TIPO DE EMPAQUE DEL PRODUCTO: ");
        String tipoEmpaque = scanner.nextLine();

        System.out.print("INGRESA UNIDAD DE MEDIDA DEL PRODUCTO: ");
        Double medidaProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("INGRESA EL TIPO DE MEDIDA DEL PRODUCTO: ");
        String tipoMedidaProducto = scanner.nextLine();

        System.out.print("INGRESA LA ETIQUETA DEL PRODUCTO: ");
        String etiquetaProducto = scanner.nextLine();

        System.out.print("INGRESA  LA CATEGORIA DEL PRODUCTO : ");
        String categoriaProducto = scanner.nextLine();

        //System.out.println("INGRESA LA CANTIDAD DEL PRODUCTO: ");
        Double cantidadProducto = null;
        //scanner.nextLine();

        //nuevo objeto
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque, medidaProducto,
                tipoMedidaProducto, etiquetaProducto, categoriaProducto, cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());

    }
}

