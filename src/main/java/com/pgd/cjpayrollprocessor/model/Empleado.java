package com.pgd.cjpayrollprocessor.model;

/**
 * Employee class
 */
public class Empleado {

    private int ID;
    private String nombre;
    private float montoMensual;
    private boolean activo;

    // Constructor
    public Empleado(int ID, String nombre, float montoMensual, boolean activo) {
        this.ID = ID;
        this.nombre = nombre;
        this.montoMensual = montoMensual;
        this.activo = activo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(float montoMensual) {
        this.montoMensual = montoMensual;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
