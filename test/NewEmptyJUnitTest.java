/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import acme.Controlador.EmpleadoControlador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void numeroCoincidencias(){
        String cadena1 = "MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00";
        String cadena2 = "MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";
        EmpleadoControlador controlador = new EmpleadoControlador();
        int coincide = controlador.compararHorario(cadena1.split(","), cadena2.split(","));
        assertEquals(2, coincide);
    }
}
