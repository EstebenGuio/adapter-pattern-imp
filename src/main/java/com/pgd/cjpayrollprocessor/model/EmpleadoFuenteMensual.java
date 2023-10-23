package com.pgd.cjpayrollprocessor.model;

/**
 * Employee class
 */
public class EmpleadoFuenteMensual extends Empleado{

    private int ID;
    private String nombre;
    private float montoMensual;
    private boolean activo;

    // Constructor
    public EmpleadoFuenteMensual(int ID, String nombre, float montoMensual, boolean activo) {
        this.ID = ID;
        this.nombre = nombre;
        this.montoMensual = montoMensual;
        this.activo = activo;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public float getMontoMensual() {
        return montoMensual;}

    @Override
    public void setMontoMensual(float montoMensual) {
        this.montoMensual = montoMensual;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
