/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch;

import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */
public class Demo_binarySearch {
    
    
    int size = 25;
    int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
        41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

public int binarySearch(int x) {
    int min = 0;
    int max = size - 1;
    while (min <= max) {
        int guess = min + (max - min) / 2;
        if (primes[guess] == x) {
            return guess;
        } else if (primes[guess] < x) {
            min = guess + 1;
        } else {
            max = guess - 1;
        }
    }
    return -1;
}
    

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        Demo_binarySearch ob = new Demo_binarySearch();
        
          int x;
    x = in.nextInt();
    int position = ob.binarySearch(x);
        System.out.println(position);
        
        
        
    }



}
