package com.pgd.cjpayrollprocessor.adapter;

import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;
import com.pgd.cjpayrollprocessor.model.EmpleadoFuenteMensual;
import com.pgd.cjpayrollprocessor.model.EmpleadoFuentePorHora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simulate select from database
 */
public class ProveedorMiembrosPlanillaImplDatabase implements ProveedorMiembrosPlanilla {
    @Override
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleadoFuenteMensuals = new ArrayList<>();
        empleadoFuenteMensuals.add(new EmpleadoFuenteMensual(1, "Empleado1", 1000, true));
        empleadoFuenteMensuals.add(new EmpleadoFuenteMensual(2, "Empleado2", 1500, false));
        empleadoFuenteMensuals.add(new EmpleadoFuentePorHora(3, "Empleado2", Arrays.asList(100f, 19f, 25f), false));
        return empleadoFuenteMensuals;
    }
}
