/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedecorreo.abstractas;

import clientedecorreo.clases.Carpeta;
import clientedecorreo.clases.Mensaje;

/**
 *
 * @author Flia_cer
 */

//ES EL COMPONENTE DEL PATRON COMPOSITE - ES EL CONTEXTO DEL PATRON STRATEGY
public abstract class ACuentaDeCorreo {
    
    public String nombreComponente;
    AExportar estrategiaExportar; //Interfaz para Exportar
    
    public ACuentaDeCorreo (String nombre) {
        this.nombreComponente = nombre;
    }
    /*-----------------------------------STRATEGY---------------------------------------*/
    
    public void setEstrategia (AExportar estrategia) { //Elijo la estrategia
        this.estrategiaExportar = estrategia;
    }
    
    public void ejecutarEstrategia (Mensaje mensaje, Carpeta carpetaOrigen, Carpeta carpetaDestino) {
        estrategiaExportar.exportarMensaje(mensaje, carpetaOrigen, carpetaDestino);
    }
    /*-----------------------------------COMPOSITE---------------------------------------*/
    //Metodos que utilizan los nodos
    public void agregarComponente (ACuentaDeCorreo componente) {} //Crea un nuevo NODO o CARPETA
    public void eliminarComponente(ACuentaDeCorreo componente) {} //Elimina un NODO o una CARPETA
    public void mostrarHijos () {} //Muesta los hijos de un componente compuesto (CARPETA)
    
    //Metodos que utlilizan las carpetas
    public void agregarMensaje (Mensaje mensaje) {} //Agregar un mensaje a la carpeta
    public void eliminarMensaje (Mensaje mensaje) {} //Eliminar un mensaje de la carpeta
    public void mostrarMensajes () {} //Mostrar los mensajes de la carpeta
}