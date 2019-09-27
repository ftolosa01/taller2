/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author frnano
 */
public class Vendedor {
    
    private String id;
    private String nombre;
    private String apellido;
    private String rut;

    public Vendedor(String id, String nombre, String apellido, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
