/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.Utileria;

/**
 *
 * @author USER
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
public class AgregadoConcreto implements Agregado
{
     protected Vector aDatos = new Vector();
    
    public AgregadoConcreto() throws FileNotFoundException {
        this.llenar();
    }
    
     @Override
     public Iterador getIterador()
    {
        return new IteradorConcreto( this );
    }
    
    public void llenar() throws FileNotFoundException
    {
        
        File doc = new File("test/data.txt");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine())
            this.aDatos.add( obj.nextLine() );
        
        
    }
}