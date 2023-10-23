package com.pgd.cjpayrollprocessor.adapter;

import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;
import com.pgd.cjpayrollprocessor.model.EmpleadoFuenteMensual;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulate rest api call GET
 */
public class ProveedorMiembrosPlanillaImplAbstract implements ProveedorMiembrosPlanilla {
    @Override
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleadoFuenteMensuals = new ArrayList<>();
        empleadoFuenteMensuals.add(new EmpleadoFuenteMensual(1, "Empleado1", 1000, true));
        empleadoFuenteMensuals.add(new EmpleadoFuenteMensual(2, "Empleado2", 1500, false));
        return empleadoFuenteMensuals;
    }
}
