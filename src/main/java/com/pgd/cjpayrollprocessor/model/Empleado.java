package com.pgd.cjpayrollprocessor.model;

public abstract class Empleado {

    private int ID;
    private String nombre;
    private float montoMensual;
    private boolean activo;
    public abstract float getMontoMensual();

    public abstract int getID();


    public abstract void setID(int ID);

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract void setMontoMensual(float montoMensual);

    public abstract boolean isActivo();

    public abstract void setActivo(boolean activo);
}
