

package binarySearch.C;


import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */
public class FulanitoSimple {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
      int Q = in.nextInt();
      int N = in.nextInt();
      int Ns[] = new int[N];
      Ns[0]= in.nextInt();
      
      for (int i = 1; i < N; i++) {
        Ns[i] = Ns[i-1] + in.nextInt();
      }    
     
      for (int j = 0; j < Q; j++) {
         int qs = in.nextInt();
      
         for(int k =0; k<N; k++){
             if(Ns[k] <= (Ns[k] + Ns[k+1])){
                 System.out.println(k + " "+(qs - Ns[k]));
             }
         }
           
     }
        
    }
    
}
