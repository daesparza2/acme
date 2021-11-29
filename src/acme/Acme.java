/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme;

import acme.Controlador.EmpleadoControlador;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class Acme {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        EmpleadoControlador controlador = new EmpleadoControlador();
        controlador.imprimir();
    }
    
  
    
}
