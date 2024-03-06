/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch.C;

import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */
public class Fulanito {
    
    public static int binarySearch(int target , int size ,int []Ns) {
    
    
    int min = 0;
    int max = size - 1;
     int guess = 0 ; 
    while (min <= max) {
     guess = min + (max - min) / 2;
        if (Ns[guess] == target) {
            return guess;
            
        } else if (Ns[guess] < target) {
            min = guess + 1;
        } else {
            max = guess - 1;
        }

    }

    return guess-1;
}
        
    
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
      
         int a = binarySearch(qs,N,Ns)  ;
         
         System.out.println((a+1) + " "+(qs - Ns[a]));
     }
        
        
    }   
}
