
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_7_THROW_EXCEPTION {
    
    public static void main(String[] args) {
        prueba obj = new prueba();
        
        do{
        try {
            Scanner leer = new Scanner(System.in);           
            System.out.print("\nIntroduzca un valor: ");
            obj.setValor(leer.nextInt());
            break;
        } catch (Exception ex) {//Es la superclase de todas las excepciones las capturara a todas
            System.out.println(ex.getMessage()); //Complica encontrar el error correcto y por lo tanto su solucion
        }        
        }while(true);
        
        System.out.println("\nEl valor del objeto es: "+obj.getValor());
    }
    
}

class prueba{
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {
        if(valor < 0){
            throw new Exception("\nEl valor " + valor + " es invalido. "
                    + "\nDebe ser mayor o igual a cero: ");
            
        }
        else{
        this.valor = valor;
        }
    }
    
    
    
}