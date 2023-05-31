
package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    public static void main(String[] args) {
        
        String ruta = "D:\\archivos\\";
        
        try {
            writeUsingFiles(ruta, "Prueba de escritura de archivos usando:\nCLASE FILES!!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeUsingFileWriter(ruta, "Prueba de escritura de archivos usando:\n\nCLASE FILE WRITER!!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeUsingBufferedWriter(ruta, "Prueba de escritura de archivos usando: CLASE BUFFERED WRITER!!!\n");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        
        //Si el archivo no existe, lo crea
        
        //Si existe, lo sobreescribe
        
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path, datos.getBytes());
        
    }
    
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(file);
        
        fileWriter.write(datos);
        fileWriter.close();
        
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        
        Path path = Paths.get(ruta + "archivoFilesBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        
        for (int i = 0; i < 10; i++) {
            
            bufWriter.write((i+1)+ ": " + datos);
            bufWriter.write("\n");
            
        }
        bufWriter.close();
        osWriter.close();
       
    }
}
