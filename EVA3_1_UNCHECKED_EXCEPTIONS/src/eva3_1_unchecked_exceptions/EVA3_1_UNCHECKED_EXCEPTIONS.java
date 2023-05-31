
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {
    
    public static void main(String[] args) {
        
    //ARITHMETIC EXCEPTION: DIVISION ENTRE CERO
        /*System.out.println("Iniciando en programa");
        
        System.out.println("Declarando Variables");
        int x = 5, y = 0;
        System.out.println("Intentar la division");
        int resu = x/y;//Aqui se produjo la excepcion
                       //Si no se atiende el prograna termina
        
        System.out.println("Resultado: "+resu);//Ya no se ejecuta*/
        
    //INPUTMISMATCH EXCEPTION
        /*Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int nume = leer.nextInt(); //Si el usuario captura una cadena que no
                                   // puede convertirese a número se produce la
                                   // excepcion y el programa termina
        System.out.println("El número es: "+nume);*/
        
    //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        /*[] arreglo = new int[5];//Arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        
        arreglo[5] = 600; //5 no es un indice valido
                        //el arreglo va de 0 a 4*/
    }
    
}
