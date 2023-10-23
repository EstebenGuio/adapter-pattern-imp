package com.pgd.cjpayrollprocessor.controller;

import com.pgd.cjpayrollprocessor.application.ProcesadorPlanillas;
import com.pgd.cjpayrollprocessor.exception.NotValidId;
import com.pgd.cjpayrollprocessor.exception.NotValidName;
import com.pgd.cjpayrollprocessor.exception.ProcesadorPlanillaException;
import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;

import java.util.List;

/**
 * Expose methods to get data
 * and some excpetions
 */
public class ProcesadorPlanillaController {

    private ProcesadorPlanillas procesadorPlanillas;

    private ProveedorMiembrosPlanilla proveedor;

    public ProcesadorPlanillaController(ProcesadorPlanillas procesadorPlanillas, ProveedorMiembrosPlanilla proveedor) {
        this.procesadorPlanillas = procesadorPlanillas;
        this.proveedor = proveedor;
    }

    /**
     * Generate monthly payments
     * 1. Get employees as list
     * 2. CHeck for exceptions
     * 3. Get total
     * 4. check if negative exception
     *
     * @return total
     * @throws ProcesadorPlanillaException
     */
    public float generarPagoMensual() throws ProcesadorPlanillaException {

        //1
        List<Empleado> empleados = proveedor.obtenerEmpleados();

        //2
        try {
            validarDatosEmpleado(empleados);
        } catch (NotValidName e) {
            throw new ProcesadorPlanillaException("No se pudo generar la planilla por que un empleado no tiene nombre valido");
        } catch (NotValidId e) {
            throw new ProcesadorPlanillaException("No se pudo generar la planilla por que un empleado no tiene id valido");
        }

        //3
        float total = procesadorPlanillas.obtenerMontoTotal(empleados);

        //4
        if (total < 0) {
            throw new ProcesadorPlanillaException("El monto mensual es negativo");
        }
        return total;
    }

    /**
     * Check employee data
     * <p>
     * 1. Loop over employees
     * 2. Check if name is valod
     * 3. Check if id is valid
     *
     * @param empleados
     * @return
     * @throws NotValidName
     * @throws NotValidId
     */
    private void validarDatosEmpleado(List<Empleado> empleados) throws NotValidName, NotValidId {

        //1
        for (Empleado empleado : empleados) {

            //2
            if (empleado.getNombre().isEmpty() || empleado.getNombre() == null) {
                throw new NotValidName("El empleado no tiene un nombre valido");
            }

            //3
            if (empleado.getID() < 1) {
                throw new NotValidId("El empleado no tiene un ID valido");
            }
        }
    }

}
