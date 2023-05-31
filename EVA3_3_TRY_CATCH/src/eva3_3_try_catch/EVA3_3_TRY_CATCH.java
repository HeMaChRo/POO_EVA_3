
package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

   
    public static void main(String[] args) {
        
        int x = 5, y = 0;
        try{//Seccion de codigo que potencialmente genera una excepcion
            
        int resu = x / y;        
        System.out.println("Resultado = " + resu);
        
        }
        catch(ArithmeticException e){
            //Se genera un objeto excepcion llamado "e"
            //de tipo AritmethicException
        
            System.out.println("Se produjo un error " + e.getMessage());
            
        }
        
        System.out.println("Programa terminado");
    }
    
}
