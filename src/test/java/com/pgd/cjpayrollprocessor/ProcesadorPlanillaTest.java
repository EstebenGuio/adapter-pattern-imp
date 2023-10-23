package com.pgd.cjpayrollprocessor;

import com.pgd.cjpayrollprocessor.adapter.ProveedorMiembrosPlanillaImplDatabase;
import com.pgd.cjpayrollprocessor.application.ProcesadorPlanillas;
import com.pgd.cjpayrollprocessor.controller.ProcesadorPlanillaController;
import com.pgd.cjpayrollprocessor.exception.ProcesadorPlanillaException;
import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.model.Empleado;
import com.pgd.cjpayrollprocessor.model.EmpleadoFuenteMensual;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesadorPlanillaTest {

    /**
     * Test total amount
     * 1. Creates a new provider using adapter
     * 2. Creates controller
     * 3. Assert test
     *
     * @throws ProcesadorPlanillaException
     */
    @Test
    public void testObtenerMontoTotal() throws ProcesadorPlanillaException {

        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);

        //3 - working
        assertEquals(1000, controller.generarPagoMensual(), 0);
    }

    /**
     * Test negative amount
     * 1. Creates a new provider
     * 2. Populate with employees
     * 3. Init new instance of controller with provider & employees
     * 4. Assert test giving exception (negative numbers)
     *
     *
     * Modify test in order to pass
     *
     * @throws ProcesadorPlanillaException
     */
    @Test(expected = ProcesadorPlanillaException.class)
    public void testMontoMensualNegativo() throws ProcesadorPlanillaException {
        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);

        //3 - working
        assertEquals(1000, controller.generarPagoMensual(), 0);
    }

    /**
     * Test negative amount
     * 1. Creates a new provider
     * 2. Populate with employees
     * 3. Init new instance of controller with provider & employees
     * 4. Assert test giving exception (id 0)
     *
     * Modify test in order to pass
     *
     * @throws ProcesadorPlanillaException
     */
    @Test(expected = ProcesadorPlanillaException.class)
    public void testEmpleadoIdNegativo() throws ProcesadorPlanillaException {
        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);

        //3 - working
        assertEquals(1000, controller.generarPagoMensual(), 0);
    }

    /**
     * Test negative amount
     * 1. Creates a new provider
     * 2. Populate with employees
     * 3. Init new instance of controller with provider & employees
     * 4. Assert test giving exception (name empty)
     *
     * Modify test in order to pass
     *
     * @throws ProcesadorPlanillaException
     */
    @Test(expected = ProcesadorPlanillaException.class)
    public void testEmpleadoNombreVacio() throws ProcesadorPlanillaException {
        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);

        //3 - working
        assertEquals(1000, controller.generarPagoMensual(), 0);
    }

}
