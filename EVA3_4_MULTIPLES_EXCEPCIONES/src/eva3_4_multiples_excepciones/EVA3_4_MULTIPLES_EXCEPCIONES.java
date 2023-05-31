
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {
    
    public static void main(String[] args) {
        int x, y;
        int resu;
        do{
            try{
                Scanner leer = new Scanner(System.in);
        
                System.out.print("\nIntroduce el valor de x (Numero entero): ");
                x = leer.nextInt();
        
                System.out.print("\nIntroduce el valor de y (Numero entero): ");
                y = leer.nextInt();
        
                resu = x / y;
                break;
            }
            catch(ArithmeticException e){
                System.out.println("\nNo se puede dividir entre cero");
            }
            catch(InputMismatchException e){
                System.out.println("\nCaptura en formato incorrecto");
            }            
        }while(true);
        
        System.out.println("Resultado de " + x + " / " + y + " = " + resu);

        
        System.out.println("\nPrograma terminado exitosamente");
    }
    
}
