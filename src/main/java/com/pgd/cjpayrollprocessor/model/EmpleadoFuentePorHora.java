package com.pgd.cjpayrollprocessor.model;

import java.util.List;

/**
 * Employee class
 */
public class EmpleadoFuentePorHora extends Empleado {

    private int ID;
    private String nombre;
    private float montoMensual;
    private boolean activo;
    private List<Float> pagos;

    // Constructor
    public EmpleadoFuentePorHora(int ID, String nombre, List<Float> pagos, boolean activo) {
        this.ID = ID;
        this.nombre = nombre;
        this.pagos = pagos;
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
        float pagoTotal = 0;
        for (Float pagoPorHora : pagos) {
            pagoTotal += pagoPorHora;
        }
        return pagoTotal;
    }

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
