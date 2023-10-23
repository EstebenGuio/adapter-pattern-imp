package com.pgd.cjpayrollprocessor.infraestructure.adapter;

import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulate select from database
 */
public class ProveedorMiembrosPlanillaImplDatabase implements ProveedorMiembrosPlanilla {
    @Override
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1, "Empleado1", 1000, true));
        empleados.add(new Empleado(2, "Empleado2", 1500, false));
        return empleados;
    }
}
