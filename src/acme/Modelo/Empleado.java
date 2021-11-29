/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.Modelo;

/**
 *
 * @author USER
 */
public class Empleado {
    
    private String nombre;
    private Calendario horario;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setHorario(Calendario horario){
        this.horario = horario;
    }
    
    public Calendario getHorario(){
        return this.horario;
    }
}
