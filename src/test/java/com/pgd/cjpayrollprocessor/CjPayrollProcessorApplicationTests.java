package com.pgd.cjpayrollprocessor;

import com.pgd.cjpayrollprocessor.application.ProcesadorPlanillas;
import com.pgd.cjpayrollprocessor.controller.ProcesadorPlanillaController;
import com.pgd.cjpayrollprocessor.exception.ProcesadorPlanillaException;
import com.pgd.cjpayrollprocessor.infraestructure.ProveedorMiembrosPlanilla;
import com.pgd.cjpayrollprocessor.infraestructure.adapter.ProveedorMiembrosPlanillaImplDatabase;
import com.pgd.cjpayrollprocessor.model.Empleado;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CjPayrollProcessorApplicationTests {


    /**
     * Test total amount
     * 1. Creates a new provider using adapter
     * 2. Creates controller
     * 3. Assert test
     *
     * @throws ProcesadorPlanillaException
     */
    @org.junit.Test
    public void testObtenerMontoTotal() throws ProcesadorPlanillaException {

        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);

        //3 - working
        assertEquals(1000, controller.generarPagoMensual(), 0);
    }

    /**
     * Test total amount
     * 1. Creates a new provider using adapter
     * 2. Creates controller
     * 3. Assert test
     *
     * @throws ProcesadorPlanillaException
     */
    @org.junit.Test(expected = ProcesadorPlanillaException.class)
    public void testMontoMensualNegativo() throws ProcesadorPlanillaException {

        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);
        //3 - Must go and set data to fail in impl
        assertEquals(-2000, controller.generarPagoMensual(), 0);
    }

    /**
     * Test negative amount
     * 1. Creates a new provider using adapter
     * 2. Creates controller
     * 3. Assert test
     *
     * @throws ProcesadorPlanillaException
     */
    @org.junit.Test(expected = ProcesadorPlanillaException.class)
    public void testEmpleadoIdNegativo() throws ProcesadorPlanillaException {

        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);
        //3 - Must go and set data to fail in impl
        assertEquals(0, controller.generarPagoMensual(), 0);
    }

    /**
     * Test negative amount
     * 1. Creates a new provider using adapter
     * 2. Creates controller
     * 3. Assert test
     *
     * @throws ProcesadorPlanillaException
     */
    @Test(expected = ProcesadorPlanillaException.class)
    public void testEmpleadoNombreVacio() throws ProcesadorPlanillaException {

        //1
        ProveedorMiembrosPlanilla proveedorBaseDeDatos = new ProveedorMiembrosPlanillaImplDatabase();
        //2
        ProcesadorPlanillaController controller = new ProcesadorPlanillaController(new ProcesadorPlanillas(), proveedorBaseDeDatos);
        //3 - Must go and set data to fail in impl
        assertEquals(0, controller.generarPagoMensual(), 0);
    }

}
