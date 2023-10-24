package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    //Atributos
    final String codigoProducto ;
    private String nombreProducto;
    private String marcaProducto;
    private String tipoEmpaque;
    private Double medidaProducto;
    private  String tipoMedidaProducto;
    private String etiquetaProducto;
    private String categoriaProducto;
    private Double cantidadProducto;
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

    @Override
    public String toString () {
        return "Producto:" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", marcaProducto='" + marcaProducto + '\'' +
                ", tipoEmpaque='" + tipoEmpaque + '\'' +
                ", medidaProducto=" + medidaProducto +
                ", tipoMedidaProducto='" + tipoMedidaProducto + '\'' +
                ", etiquetaProducto='" + etiquetaProducto + '\'' +
                ", categoriaProducto='" + categoriaProducto + '\'' +
                ", cantidadProducto=" + cantidadProducto +
                ", productoList=" + productoList +
                '}';
    }

}
