package Tienda.VENTA;

import Tienda.PRODUCTO.Producto;

import java.util.Date;
import java.util.Optional;

public class Venta {

    //Atributos
    final String idVenta;
    private Double valorUnitario;
    private Double ivaVenta;
    private Double valorTotal;
    private String fechaVenta;
    private String horaVenta;
    private Double cantidadVenta;
    private Optional<Producto> productosVenta;
    private Double totalVenta;


    //constructor
    public Venta(String idVenta, Double valorUnitario, Double ivaVenta, Double valorTotal,
                 String fechaVenta, String horaVenta, Double cantidadVenta,Optional<Producto> productosVenta,
                 Double totalVenta) {
        this.idVenta = idVenta;
        this.valorUnitario = valorUnitario;
        this.ivaVenta = ivaVenta;
        this.valorTotal = valorTotal;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.cantidadVenta = cantidadVenta;
        this.productosVenta = productosVenta;
        this.totalVenta = totalVenta;
    }

    //get y sed

    public String getIdVenta() {
        return idVenta;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(Double ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(String horaVenta) {
        this.horaVenta = horaVenta;
    }

    public Double getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(Double cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public Optional<Producto> getProductosVenta() {
        return productosVenta;
    }

    public void setProductosVenta(Optional<Producto> productosVenta) {
        this.productosVenta = productosVenta;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    //Metodo
    @Override
    public String toString() {
        return "Venta: " +
                "Fecha: " + fechaVenta + " | " +" Hora: "+ horaVenta + '\n' +
                "Id Venta: " + idVenta + '\'' + '\n' +
                "Cantidad de producto: " + cantidadVenta +'\n' +
                "Valor Unitario: " + valorUnitario + '\n' +
                "IVA Venta: " + ivaVenta + '\n' +
                "Valor Total: " + valorTotal + '\n' +
                "Valor Total mas Iva: " + totalVenta ;
    }
}




