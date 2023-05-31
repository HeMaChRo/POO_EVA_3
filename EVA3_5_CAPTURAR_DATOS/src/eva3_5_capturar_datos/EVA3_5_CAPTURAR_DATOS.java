
package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURAR_DATOS {

    public static void main(String[] args) {
        
        int valor;
        
        do{
            try{
            Scanner leer = new Scanner(System.in);
            System.out.print("Introduce el valor de x (Numero entero): ");
            valor = leer.nextInt();
            break;
            }
            catch(InputMismatchException e){
                System.out.println("El valor es erroneo, introduce uno correcto: ");
            }
        }while(true);
               
        System.out.println("\nEl valor capturado es: " + valor);
    }
    
}
