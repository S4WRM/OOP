
package newbank;

import java.util.ArrayList;
import java.util.List;


public class Funds {
    
    
     public static void main(String[] args){
        
        List<Integer> funds = new ArrayList<Integer>();
        funds.add(100);
        funds.add(900);
        funds.add(300);
        funds.add(0, 750);
        for (Integer fund : funds) {
           System.out.println(fund);
        }
       funds.remove(2);
       //lista actualizada 
        for (Integer fund : funds) {
           System.out.println(fund);
        }
  
        int suma=0;
         for (Integer fund : funds) {
             suma=suma+fund;
             
            System.out.println("los fondos son de:" +suma);
             
         }
    }
}
