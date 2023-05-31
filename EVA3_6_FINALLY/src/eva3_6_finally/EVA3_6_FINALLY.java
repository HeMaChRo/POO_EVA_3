
package eva3_6_finally;

public class EVA3_6_FINALLY {
    public static void main(String[] args) {
        int x = 5, y = 1;
        
        try{
            int resu = x / y;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Siempre me ejecuto!");
        }
        
        System.out.println("Termina el programa");
    }
    
}
