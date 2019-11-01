/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedecorreo.clases;

import clientedecorreo.abstractas.ACuentaDeCorreo;
import java.util.*;

/**
 *
 * @author Flia_cer
 */
// ES EL COMPUESTO EN EL PATRON COMPOSITE -> SOLO PUEDE CONTENER CARPETAS 
public class Nodo extends ACuentaDeCorreo {
    
    private final ArrayList <ACuentaDeCorreo> misHijos = new ArrayList<>();
    
    public Nodo(String nombre) {
        super(nombre);
        System.out.println("Nuevo nodo '" + nombre + "' creado...");
    }
    
    @Override
    public void agregarComponente (ACuentaDeCorreo componente) {
        misHijos.add(componente);
        System.out.println("Nuevo componente '" + componente.nombreComponente + "' se ha agregado a " + this.nombreComponente);
    } 
    
    @Override
    public void eliminarComponente(ACuentaDeCorreo componente) {
        misHijos.remove(componente);
        System.out.println("Componente " + componente.nombreComponente + " se ha eliminado de " + this.nombreComponente);
    } 
    
    @Override
    public void mostrarHijos () {
        System.out.println("\nLa " + this.nombreComponente + " tiene estos hijos:");
        for (int i = 0; i < misHijos.size(); i++) {
            System.out.println("-" + misHijos.get(i).nombreComponente);
        }
    }
}