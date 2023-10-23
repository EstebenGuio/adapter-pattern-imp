package com.pgd.cjpayrollprocessor.infraestructure;

import com.pgd.cjpayrollprocessor.model.Empleado;

import java.util.List;

public interface ProveedorMiembrosPlanilla {
    /**
     * Used to get a List of employees
     * @return List
     */
    List<Empleado> obtenerEmpleados();

}
