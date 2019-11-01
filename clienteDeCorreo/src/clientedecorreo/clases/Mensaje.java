/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedecorreo.clases;

/**
 *
 * @author Flia_cer
 */
public class Mensaje {
    private String tituloMensaje;
    private String contenidoMensaje;
    
    public Mensaje () {
        System.out.println("Mensaje Creado...");
    }
    
    public void setTitulo (String titulo) {
        this.tituloMensaje = titulo;
    }
    
    public String getTitulo () {
        return tituloMensaje;
    }
    
    public void setContenido (String contenido) {
        this.contenidoMensaje = contenido;
    }
    
    public String getContenido () {
        return contenidoMensaje;
    }
}