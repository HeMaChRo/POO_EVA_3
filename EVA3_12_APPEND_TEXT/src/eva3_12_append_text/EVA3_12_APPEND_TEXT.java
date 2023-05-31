/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_append_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EVA3_12_APPEND_TEXT {
    private static OpenOption[] OpenFileInputStreamAction;

    public static void main(String[] args) {
        
        String ruta = "D:\\archivos\\";
        
        try {
            writeUsingBufferedWriter(ruta,"¡Prueba de append! ");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPEND_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        
        
        File file = new File(ruta + "archivoFilesBufferedWriter.txt");
        FileWriter fileWriter = new FileWriter(file, true);               
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        
        for (int i = 0; i < 10; i++) {
            
            bufWriter.write((i+1)+ ": " + datos);
            bufWriter.write("\n");
            
        }
        bufWriter.close();
        fileWriter.close();
       
    }
    
}
