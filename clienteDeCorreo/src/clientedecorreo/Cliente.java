/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedecorreo;

import clientedecorreo.clases.*;
import clientedecorreo.estrategias.*;

/**
 *
 * @author Flia_cer
 */
public class Cliente {
    
    public static void main(String[] args) {
        Nodo clienteCorreo = new Nodo("Cliente Correo");
        Carpeta inbox = new Carpeta("Inbox");
        Carpeta sentMails = new Carpeta("Sent Mails");
        Carpeta spam = new Carpeta("Spam");
        
        clienteCorreo.agregarComponente(inbox);
        clienteCorreo.agregarComponente(sentMails);
        clienteCorreo.agregarComponente(spam);
       
        Mensaje mensajeA = new Mensaje();
        mensajeA.setTitulo("Hola señor Thompson");
        mensajeA.setContenido("Cuando le pise el pie usten mueve la cabeza");
        
        sentMails.agregarMensaje(mensajeA); //El mensaje A esta en la carpeta 'Sent Mails'
        sentMails.mostrarMensajes();
        
        //Ahora quiero exportar el mensajeA en formato XML a la carpeta 'Spam'
        ExportarXML estrategiaXML = new ExportarXML("Exportar XML"); //--> CREO UNA ESTRATEGIA
        clienteCorreo.setEstrategia(estrategiaXML); //-->SETEO ESA ESTRATEGIA
        clienteCorreo.ejecutarEstrategia(mensajeA, sentMails, spam);//-->MUEVO EL MENSAJE DE CARPETA
        
        spam.mostrarMensajes();
        sentMails.mostrarMensajes();
    }
}