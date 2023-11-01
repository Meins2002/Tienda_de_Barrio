package Tienda.COMPRA;


import Tienda.PRODUCTO.Producto;

import java.util.List;
import java.util.Date;
import java.util.Optional;

public class Compra {


    //Atributos
    private String idCompra;
    private int nitProveedor;
    private String nombreProveedor;
    private Date fechaCompra;
    private Double valorUnitario;
    private Double valorTotal;
    private Optional <Producto> productosCompra;
    private Double Cantidad;
    public Compra(String idCompra, String nombreProveedor, Date fechaCompra, Double valorUnitario, Double valorTotal,
                  Integer nitProveedor, Optional<Producto> productosCompra, Double Cantidad ) {
        this.idCompra = idCompra;
        this.nombreProveedor = nombreProveedor;
        this.fechaCompra = fechaCompra;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.nitProveedor = nitProveedor;
        this.productosCompra = productosCompra;
        this.Cantidad = Cantidad;

    }

    //Get y set
    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(Integer nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public Optional<Producto> getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(Optional<Producto> productosCompra) {
        this.productosCompra = productosCompra;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    //Metodo
    @Override
    public String toString() {
        String productoInfo = productosCompra.isPresent() ?
                "Id producto =" + this.productosCompra.get().getCodigoProducto() +
                        "Nombre producto =" + this.productosCompra.get().getNombreProducto() :
                "Producto no asociado";

        return "Compra : " + '\n' +
                "Id Compra: " + idCompra + '\'' + '\n' +
                "Nombre Proveedor: " + nombreProveedor + '\'' +'\n' +
                "Nit Proveedor:  " + nitProveedor + '\n' +
                "Fecha Compra: " + fechaCompra + '\n' + productoInfo + '\n' +
                "Valor Unitario: " + valorUnitario + '\n' +
                "Valor Total: " + valorTotal ;
    }

}
