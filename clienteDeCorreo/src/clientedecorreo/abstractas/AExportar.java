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
//INTERFAZ ESTRATEGIA DEL PATRON STRATEGY
public abstract class AExportar {
    public String nombreEstrategia;
    
    public void exportarMensaje (Mensaje mensaje, Carpeta carpetaOrigen, Carpeta carpetaDestino) {} //Metodo para exportar un mensaje
}
