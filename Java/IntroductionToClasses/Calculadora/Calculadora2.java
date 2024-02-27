
package calculadora2;

package calculadora2;


public class Calculadora2 {

    int x;
    int y;
    float z;
   
public Calculadora2 (int a, int b, float c){

    x = a;
    y = b;
    z = c;

}
    public float suma(int a, int b){
    
        x = a;
        y = b;
        z = x+y;
        return z;
           
    }
    
    public float resta(int a, int b){
    
        x = a;
        y = b;
        z = x-y;
        return z;
    
    }
    
    public float multi(int a, int b){
    
    
        x = a;
        y = b;
        z = x*y;
        return z;
    }
   
    public float division(int a, int b){
    
        x = a;
        y = b;
        z = x/y;
        return z;
    
    }
    public static void main(String[] args) {
        
        Calculadora2 calc = new Calculadora2 (0,0,0);
        System.out.println("la suma es: " + calc.suma(5,4));
        System.out.println("la resta es: " + calc.resta(9,7));
        System.out.println("la multiplicacion es: " + calc.multi(7,2));
        System.out.println("la division es: " + calc.division(9,1));

    }
    
}