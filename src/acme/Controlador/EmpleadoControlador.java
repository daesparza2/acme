/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.Controlador;

import acme.Modelo.Calendario;
import acme.Modelo.Empleado;
import acme.Servicio.EmpleadoServicio;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author USER
 */
public class EmpleadoControlador {
       
    public void imprimir() throws FileNotFoundException{
        
        EmpleadoServicio servicio = new EmpleadoServicio();
        List<Empleado> empleados = servicio.listar();
        for(int i = 0 ; i< empleados.size() - 1; i++){
            for(int j = i + 1 ; j< empleados.size() ; j++){
                int coincidencia = compararHorario(empleados.get(i).getHorario().getHoras(),empleados.get(j).getHorario().getHoras());
                System.out.println(empleados.get(i).getNombre() + "-" + empleados.get(j).getNombre() + ": " + coincidencia);
            }
            
        }
    }
    
    public int compararHorario(String[] horario1, String[] horario2){
        int coincidencias = 0;
        for(String hora1 : horario1){
            for(String hora2 : horario2){
                if(hora1.equals(hora2)){
                    coincidencias++;
                }
            }
        }
        return coincidencias;
    }
    
}
