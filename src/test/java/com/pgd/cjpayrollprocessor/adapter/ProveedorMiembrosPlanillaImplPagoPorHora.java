package com.pgd.cjpayrollprocessor.adapter;

import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;
import com.pgd.cjpayrollprocessor.model.EmpleadoFuentePorHora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simulate rest api call GET
 */
public class ProveedorMiembrosPlanillaImplPagoPorHora implements ProveedorMiembrosPlanilla {
    @Override
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleadoFuenteMensual = new ArrayList<>();

                                                    //int ID, String nombre, List<Float> pagos, boolean activo
        empleadoFuenteMensual.add(new EmpleadoFuentePorHora(1, "Empleado por hora", Arrays.asList(100.0f,200.09f), true));
        empleadoFuenteMensual.add(new EmpleadoFuentePorHora(1, "Empleado por hora", Arrays.asList(100.0f,200.09f), true));
        empleadoFuenteMensual.add(new EmpleadoFuentePorHora(1, "Empleado por hora", Arrays.asList(100.0f,200.09f), true));
        return empleadoFuenteMensual;
    }
}
