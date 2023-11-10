package Tienda.PRODUCTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ProductService {

        public void productSrvice (String ruta){

            List<Producto> products_csv = new ArrayList<>();

            try {
                File file = new File(ruta);
                Scanner fileScanner = new Scanner(file);
                //Saltar el encabezado del CSV
                fileScanner.nextLine();
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] productInfo = line.split(",");
                    System.out.println(productInfo[0]); // [0] Columnas
                    System.out.println(line);


                    Producto producto = new Producto("", "", "", "",
                            0.0, " "," "," ",
                            0.0 );

                    if (productInfo.length == 1) {
                        producto.setCodigoProducto(productInfo[0]);

                    } else if (productInfo.length == 2) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);

                    } else if (productInfo.length == 3) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);

                    } else if (productInfo.length == 4) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);

                    } else if ((productInfo.length == 5)) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);
                        producto.setMedidaProducto(Double.valueOf(productInfo[4]));

                    }else if ((productInfo.length == 6)) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);
                        producto.setMedidaProducto(Double.valueOf(productInfo[4]));
                        producto.setTipoMedidaProducto(productInfo[5]);

                    }else if ((productInfo.length == 7)) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);
                        producto.setMedidaProducto(Double.valueOf(productInfo[4]));
                        producto.setTipoMedidaProducto(productInfo[5]);
                        producto.setEtiquetaProducto(productInfo[6]);

                    }else if ((productInfo.length == 8)) {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);;
                        producto.setMedidaProducto(Double.valueOf(productInfo[4]));
                        producto.setTipoMedidaProducto(productInfo[5]);
                        producto.setEtiquetaProducto(productInfo[6]);
                        producto.setCategoriaProducto(productInfo[7]);

                    } else {
                        producto.setCodigoProducto(productInfo[0]);
                        producto.setNombreProducto(productInfo[1]);
                        producto.setMarcaProducto(productInfo[2]);
                        producto.setTipoEmpaque(productInfo[3]);;
                        producto.setMedidaProducto(Double.valueOf(productInfo[4]));
                        producto.setTipoMedidaProducto(productInfo[5]);
                        producto.setEtiquetaProducto(productInfo[6]);
                        producto.setCategoriaProducto(productInfo[7]);
                        producto.setCantidadProducto(Double.valueOf(productInfo[8]));
                    }

                    if (!products_csv.contains(producto)) {
                        products_csv.add(producto);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }
        }
}
