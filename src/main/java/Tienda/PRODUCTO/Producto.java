package Tienda.PRODUCTO;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    //Atributos
    private String codigoProducto ;
    private String nombreProducto;
    private String marcaProducto;
    private String tipoEmpaque;
    private Double medidaProducto;
    private  String tipoMedidaProducto;
    private String etiquetaProducto;
    private String categoriaProducto;
    private Double cantidadProducto;
    private int precioProducto;
    private String fotoULR;
    private List<Producto> productoList = new ArrayList<>();

    // Constructor
    public Producto(String codigoProducto, String nombreProducto, String marcaProducto, String tipoEmpaque,
                    Double medidaProducto, String tipoMedidaProducto, String etiquetaProducto,
                    String categoriaProducto, Double cantidadProducto) {

        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.tipoEmpaque = tipoEmpaque;
        this.medidaProducto = medidaProducto;
        this.tipoMedidaProducto = tipoMedidaProducto;
        this.etiquetaProducto = etiquetaProducto;
        this.categoriaProducto = categoriaProducto;
        this.cantidadProducto = cantidadProducto;

    }

    // get y sed
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getTipoEmpaque() {
        return tipoEmpaque;
    }

    public void setTipoEmpaque(String tipoEmpaque) {
        this.tipoEmpaque = tipoEmpaque;
    }

    public Double getMedidaProducto() {
        return medidaProducto;
    }

    public void setMedidaProducto(Double medidaProducto) {
        this.medidaProducto = medidaProducto;
    }

    public String getTipoMedidaProducto() {
        return tipoMedidaProducto;
    }

    public void setTipoMedidaProducto(String tipoMedidaProducto) {
        this.tipoMedidaProducto = tipoMedidaProducto;
    }

    public String getEtiquetaProducto() {
        return etiquetaProducto;
    }

    public void setEtiquetaProducto(String etiquetaProducto) {
        this.etiquetaProducto = etiquetaProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Double getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Double cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

   /* public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getFotoULR() {
        return fotoULR;
    }

    public void setFotoULR(String fotoULR) {
        this.fotoULR = fotoULR;
    }*/

    @Override
    public String toString () {
        return  "******************************************" + "\n" +
                "* PRODUCTO AGREGADO CON EXITO            *" + "\n" +
                "******************************************" + "\n" +
                "  Codigo Producto:    " + codigoProducto + '\'' + "\n"+
                "  Nombre Producto:    " + nombreProducto + '\'' + "\n"+
                "  Marca Producto:     " + marcaProducto + '\'' + "\n"+
                "  Tipo Empaque:       " + tipoEmpaque + '\'' + "\n"+
                "  Medida Producto:    " + medidaProducto + "  " + tipoMedidaProducto + '\'' +"\n"+
                "  Etiqueta Producto:  " + etiquetaProducto + '\'' + "\n"+
                "  Categoria Producto: " + categoriaProducto + '\'' + "\n" +
                "******************************************" + "\n";
    }

}
