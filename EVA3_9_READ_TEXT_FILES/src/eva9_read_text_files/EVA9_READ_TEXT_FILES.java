
package eva9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA9_READ_TEXT_FILES {

    public static void main(String[] args) {
        
        String ruta = "c:\\archivos\\prueba.txt"; //Windows
        //String ruta = "/archivos/prueba; Sistemas tipo linux
        
        try {            
            
            readUsingFiles(ruta);
            
        } catch (IOException ex) {
            
            ex.printStackTrace();//Imprimir la excepcion
            
        }
    }
    
    /*
        Files --> Lee todo el archivo y lo carga en memoria principal RAM
        por lo tanto solo funciona con archivos pequeños.
    */
    
    public static void readUsingFiles(String ruta) throws IOException{
        //Recibimos ruta de texto, la convertimos a formato path
        Path ruta1 = Paths.get(ruta);
        
        //readAllLines me regresa una lista de tipo string
        /*List<String> contenidoArchivo = Files.readAllLines(ruta1);
        
        //System.out.println(contenidoArchivo.toString());
        
        for (int i = 0; i < contenidoArchivo.size(); i++) {
            
            System.out.println(contenidoArchivo.get(i));
           
        }
        */
        
        byte[] arregloBytes = Files.readAllBytes(ruta1);
        System.out.println(new String(arregloBytes));
    }
    
}
