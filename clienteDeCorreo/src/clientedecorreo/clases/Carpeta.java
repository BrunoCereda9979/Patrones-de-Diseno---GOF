
package clientedecorreo.clases;

import clientedecorreo.abstractas.ACuentaDeCorreo;
import java.util.*;

/**
 *
 * @author Flia_cer
 */
// ES LA HOJA EN EL PATRON COMPOSITE -> SOLO PUEDEN CONTENER MENSAJES
public class Carpeta extends ACuentaDeCorreo {
    
    ArrayList<Mensaje> misMensajes = new ArrayList<>(); //Lista de todos los mensajes de la carpeta
    
    public Carpeta(String nombre) {
        super(nombre);
        System.out.println("Nueva carpeta '" + nombre + "' creada...");
    }
    
    @Override
    public void agregarMensaje (Mensaje mensaje) {
        misMensajes.add(mensaje);
        System.out.println("Mensaje de titulo '" + mensaje.getTitulo() + "' se ha agregado a " + this.nombreComponente);
    }
    
    @Override
    public void eliminarMensaje (Mensaje mensaje) {
        misMensajes.remove(mensaje);
        System.out.println("Mensaje " + mensaje.getTitulo() + " eliminado de " + nombreComponente);
    }
    
    @Override
    public void mostrarMensajes () {
        System.out.println("\nLos mensajes de la carpeta " + this.nombreComponente + " son:");
        
        misMensajes.forEach((_item) -> {
            System.out.println("- Titulo: " + _item.getTitulo());
            System.out.println("  Contenido: '" + _item.getContenido() + "'\n");
        });
    }
}