/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.Servicio;

import acme.Utileria.AgregadoConcreto;
import acme.Utileria.Iterador;
import acme.Modelo.Calendario;
import acme.Modelo.Empleado;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class EmpleadoServicio {
    
    protected List<Empleado> datos = new ArrayList<Empleado>();
    
    public EmpleadoServicio() throws FileNotFoundException{
        this.llenar();
    }

    public List<Empleado> listar() {
        return this.datos;
    }
    
    public void llenar() throws FileNotFoundException{
        AgregadoConcreto agregado = new AgregadoConcreto();
        
        Iterador iterador = agregado.getIterador();
        while (iterador.hayMas() == true){
            String seg = (String) iterador.siguiente();
            String[] siguiente = seg.split("=");
            Calendario calendario = new Calendario();
            Empleado empleado = new Empleado();
            empleado.setNombre(siguiente[0]);
            calendario.setHoras( siguiente[1].split(","));
            empleado.setHorario(calendario);
            this.datos.add(empleado);
        }
    }
    
}
