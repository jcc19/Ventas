/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseph
 */
public class comprador {
    private int idcomprador;
    private String ncomprador;
    private int cantidad;
    private int precio;
    private String satisfaccion;
    private int ncompra;

    public comprador(){    
    }
    
    public comprador(int idcomprador, String ncomprador, int cantidad, int precio, String satisfaccion, int ncompra) {
        this.idcomprador = idcomprador;
        this.ncomprador = ncomprador;
        this.cantidad = cantidad;
        this.precio = precio;
        this.satisfaccion = satisfaccion;
        this.ncompra = ncompra;
    }

    public int getIdcomprador() {
        return idcomprador;
    }

    public void setIdcomprador(int idcomprador) {
        this.idcomprador = idcomprador;
    }

    public String getNcomprador() {
        return ncomprador;
    }

    public void setNcomprador(String ncomprador) {
        this.ncomprador = ncomprador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(String satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    public int getNcompra() {
        return ncompra;
    }

    public void setNcompra(int ncompra) {
        this.ncompra = ncompra;
    }
    
}
