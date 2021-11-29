/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.Servicio;

import acme.Modelo.Empleado;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IEmpleadoServicio {
    
    List<Empleado> listar();
    
}
