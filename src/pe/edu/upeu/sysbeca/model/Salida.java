/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysbeca.model;

/**
 *
 * @author alum.fial8
 */
public class Salida {
    private int idp;
    private int idperiodo;
    private int periodo;

    public Salida() {
    }

    public Salida(int idp, int idperiodo, int periodo) {
        this.idp = idp;
        this.idperiodo = idperiodo;
        this.periodo = periodo;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(int idperiodo) {
        this.idperiodo = idperiodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
}
