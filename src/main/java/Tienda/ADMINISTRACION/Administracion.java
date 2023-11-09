package Tienda.ADMINISTRACION;

import Tienda.COMPRA.Compra;
import Tienda.PRODUCTO.Producto;
import Tienda.VENTA.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;

public class Administracion {

    private List <Producto> productoList = new ArrayList<>();
    private List <Compra> compraList = new ArrayList<>();
    private List <Venta> ventaList = new ArrayList<>();


    //Definición de metodo público llamado agregarProducto que toma un objeto Producto como argumento.
    // Este método se utiliza para agregar un producto a la lista productoList
    public void agregarProducto(Producto producto){
        if (!productoList.contains(producto)) {
            productoList.add(producto);
        }
    }

    //Este método busca un producto en la lista productoList que coincida con el código proporcionado.
    //Devuelve un Optional que puede contener el producto encontrado o estar vacío si no se encuentra
    //ningún producto con ese código.
    public Optional<Producto> buscarProducto(String codigoProducto){
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findAny();
    }

    //Este método busca un producto con el código proporcionado y modifica el atributo específico
    // (nombre, marca, tipo de empaque, etc.) según la opción y el nuevo valor proporcionado.
    public Optional<Producto> modificarProducto(String codigoProducto, String opcion, String nuevoValor) {
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findFirst()
                .map(productoEncontrado -> {
                    switch (opcion) {
                        case "1":
                            productoEncontrado.setNombreProducto(nuevoValor);
                            break;
                        case "2":
                            productoEncontrado.setMarcaProducto(nuevoValor);
                            break;
                        case "3":
                            productoEncontrado.setTipoEmpaque(nuevoValor);
                            break;
                        case "4":
                            productoEncontrado.setMedidaProducto(Double.valueOf(nuevoValor));
                            break;
                        case "5":
                            productoEncontrado.setTipoMedidaProducto(nuevoValor);
                            break;
                        case "6":
                            productoEncontrado.setEtiquetaProducto(nuevoValor);
                            break;
                        case "7":
                            productoEncontrado.setCategoriaProducto(nuevoValor);
                            break;
                        case "8":
                            productoEncontrado.setCantidadProducto(Double.valueOf(nuevoValor));
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(productoEncontrado);
                })
                .orElse(Optional.empty());


        }


    public void agregarCompra(Compra compra)
    {
        if (!compraList.contains(compra)) {
            compraList.add(compra);
        }
    }
    public Optional<Compra> buscarCompra (String idCompra){
        return compraList.stream()
                .filter(compra -> compra.getIdCompra()!= null && compra.getIdCompra().equals(idCompra))
                .findAny();
    }


    public Optional<Compra> modificarCompra(String codigoCompra,int  opcion, String nuevoValor) {

        Scanner scanner = new Scanner(System.in);
        return compraList.stream()
                .filter(compra -> compra.getIdCompra().equals(codigoCompra))
                .findFirst()
                .map(compraEncontrada -> {

                    switch (opcion) {
                        case 1:
                            System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR");
                            compraEncontrada.setNombreProveedor(nuevoValor);
                            break;
                        case 2:
                            System.out.println("INGRESE EL NIT DEL PROVEEDOR");
                            compraEncontrada.setNitProveedor(Integer.parseInt(nuevoValor));
                            break;
                        case 3:
                            System.out.println("Eliminar el ID del producto actual.");
                            // Actualiza la cantidad del producto original
                            Producto productoOriginal = compraEncontrada.getProductosCompra().orElse(null);
                            if (productoOriginal != null) {
                                productoOriginal.setCantidadProducto(productoOriginal.getCantidadProducto() - compraEncontrada.getCantidad());
                            }
                            compraEncontrada.setProductosCompra(null); // Establecer como null
                            System.out.println(" ");
                            System.out.println("Ingresa el código del producto: ");
                            String nuevoCodigoProducto = scanner.nextLine();
                            Optional<Producto> productoNuevoOptional = buscarProducto(nuevoCodigoProducto);
                            if (productoNuevoOptional.isPresent()) {
                                Producto productoNuevo = productoNuevoOptional.get();
                                compraEncontrada.setProductosCompra(Optional.of(productoNuevo));
                                System.out.println(productoNuevo);
                                System.out.println("POR FAVOR INGRESA LA CANTIDAD");
                                Double nuevaCantidad = scanner.nextDouble();
                                scanner.nextLine();
                                compraEncontrada.setCantidad(nuevaCantidad);
                                productoNuevo.setCantidadProducto(productoNuevo.getCantidadProducto() + nuevaCantidad);
                                System.out.println("POR FAVOR INGRESA EL PRECIO UNITARIO");
                                Double nuevoPrecio = scanner.nextDouble();
                                scanner.nextLine();
                                compraEncontrada.setValorUnitario(nuevoPrecio);
                                double valorTotal = nuevoPrecio * nuevaCantidad;
                                compraEncontrada.setValorTotal(valorTotal);
                            } else {
                                System.out.println("Producto con el ID: " + nuevoCodigoProducto + " no encontrado");
                            }
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(compraEncontrada);
                })
                .orElse(Optional.empty());
   }

   public void agregarVenta(Venta venta){
        if (!ventaList.contains(venta)){
            ventaList.add(venta);
        }
   }
   public Optional<Venta> buscarVenta (String idVenta){
        return ventaList.stream().filter(venta -> venta.getIdVenta()!= null && venta.getIdVenta().
                equals(idVenta)).findAny();
   }

   public  Optional<Venta> modificarVenta (String codigoVenta,int  opcion, String nuevoValor) {
        Scanner scanner = new Scanner(System.in);
       return ventaList.stream()
               .filter(venta -> venta.getIdVenta().equals(codigoVenta))
               .findFirst()
               .map(ventaEncontrada -> {

                   switch (opcion) {

                       case 1:
                           System.out.println("CANTIDAD DE PRODUCTO");
                           //ventaEncontrada.setCantidadVenta(Double.parseDouble(nuevoValor));
                           if (!nuevoValor.isEmpty()) {
                               ventaEncontrada.setCantidadVenta(Double.parseDouble(nuevoValor));
                           } else {
                               System.out.println("El valor proporcionado es una cadena vacía. Por favor, ingresa un valor numérico válido.");
                           }
                           break;
                       case 2:
                           System.out.println("VALOR DEL PRODUCTO");
                           ventaEncontrada.setValorUnitario(Double.parseDouble(nuevoValor));
                           break;
                       case 3:
                           System.out.println("Eliminar el ID del producto actual.");
                           // Actualiza la cantidad del producto original
                           Producto productoOriginal = ventaEncontrada.getProductosVenta().orElse(null);
                           if (productoOriginal != null) {
                               productoOriginal.setCantidadProducto(productoOriginal.getCantidadProducto() - ventaEncontrada.getCantidadVenta());
                           }
                           ventaEncontrada.setProductosVenta(null); // Establecer como null
                           System.out.println(" ");
                           System.out.println("Ingresa el código del producto: ");
                           String nuevoCodigoProducto = scanner.nextLine();
                           Optional<Producto> productoNuevoOptional = buscarProducto(nuevoCodigoProducto);
                           if (productoNuevoOptional.isPresent()) {
                               Producto productoNuevo = productoNuevoOptional.get();
                               ventaEncontrada.setProductosVenta(Optional.of(productoNuevo));
                               System.out.println(productoNuevo);
                               System.out.println("POR FAVOR INGRESA LA CANTIDAD");
                               Double nuevaCantidad = scanner.nextDouble();
                               scanner.nextLine();
                               ventaEncontrada.setValorUnitario(nuevaCantidad);
                               productoNuevo.setCantidadProducto(productoNuevo.getCantidadProducto() + nuevaCantidad);
                               System.out.println("POR FAVOR INGRESA EL PRECIO UNITARIO");
                               Double nuevoPrecio = scanner.nextDouble();
                               scanner.nextLine();
                               ventaEncontrada.setValorUnitario(nuevoPrecio);
                               double valorTotal = nuevoPrecio * nuevaCantidad;
                               ventaEncontrada.setValorTotal(valorTotal);
                           } else {
                               System.out.println("Producto con el ID: " + nuevoCodigoProducto + " no encontrado");
                           }
                           break;

                       default:
                           System.out.println("Opción no válida.");
                           break;
                   }
                   return Optional.of(ventaEncontrada);
               })
               .orElse(Optional.empty());

   }
}
