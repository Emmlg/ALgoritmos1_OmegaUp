/*

 */
package binarySearch.B;

import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */
public class PosicionFibonacci {
    
    
  public static int fibonacciPosition(long numero) {
        
      int actual = 1 , anterior =0;
      int fibNum=0 , pos=0;
     
        if (numero <= 1){
             return (int)  numero;
        }
     
      while (actual< numero) {  
   
       // System.out.print(actual + " ");// Print the number   
       fibNum = actual + anterior;  
       anterior = actual;
       actual = fibNum;
       pos++;
      }

      
      
      if(fibNum == numero){
          return pos+1;
      }
      
      return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

       System.out.print(fibonacciPosition(sc.nextLong() )); // checar el tipo de dato
    }
    
}
