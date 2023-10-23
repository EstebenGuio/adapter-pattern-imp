package com.pgd.cjpayrollprocessor.application;

import com.pgd.cjpayrollprocessor.model.Empleado;

import java.util.List;

/**
 * Contains business logic
 */
public class ProcesadorPlanillas {

    /**
     * 1. Get the list of employees
     * 2. Iterate over employees
     * 3. If active - storing and add the Monthly amount for every employee
     * 4. Return the total
     *
     * @return total
     */
    public float obtenerMontoTotal(List<Empleado> empleados) {
        float total = 0;
        //2
        for (Empleado empleado : empleados) {
            //3
            if (empleado.isActivo()) {
                total += empleado.getMontoMensual();
            }
        }
        //4
        return total;
    }
}