package Tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    }
