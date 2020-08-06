/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class empleado {
    private int idempleado;
    private String nempleado;
    private String aempleado;
    private String referencia;
    private String estadocivil;
    private String ventas;
    
    public empleado(){     
    }

    public empleado(int idempleado, String nempleado, String aempleado, String referencia, String estadocivil, String ventas) {
        this.idempleado = idempleado;
        this.nempleado = nempleado;
        this.aempleado = aempleado;
        this.referencia = referencia;
        this.estadocivil = estadocivil;
        this.ventas = ventas;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNempleado() {
        return nempleado;
    }

    public void setNempleado(String nempleado) {
        this.nempleado = nempleado;
    }

    public String getAempleado() {
        return aempleado;
    }

    public void setAempleado(String aempleado) {
        this.aempleado = aempleado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }
    
    
}
