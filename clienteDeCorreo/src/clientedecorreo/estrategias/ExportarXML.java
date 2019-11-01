/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedecorreo.estrategias;

import clientedecorreo.abstractas.AExportar;
import clientedecorreo.clases.Carpeta;
import clientedecorreo.clases.Mensaje;

/**
 *
 * @author Flia_cer
 */
public class ExportarXML extends AExportar {
    
    public ExportarXML (String nombre) {
        this.nombreEstrategia = nombre;
        System.out.println("\nEstrategia '" + nombreEstrategia + "' creada...");
    }
    
    @Override
    public void exportarMensaje (Mensaje mensaje, Carpeta carpetaOrigen ,Carpeta carpetaDestino) {
        carpetaDestino.agregarMensaje(mensaje);
        carpetaOrigen.eliminarMensaje(mensaje);
    }
}