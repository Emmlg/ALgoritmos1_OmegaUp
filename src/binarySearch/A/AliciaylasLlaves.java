  /*
 calcular el tamano de los arreglos puede causar tiempo de ejecucion
 */
package binarySearch.A;

import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */
public class AliciaylasLlaves {
    
    
public static  int binarySearch(int target,int [] lookin,int tamp) {
    
    int min = 0;
    int max = tamp - 1;
    while (min <= max) {
        int guess = min + (max - min) / 2;
        if (lookin[guess] == target) {
            return guess;
        } else if (lookin[guess] < target) {
            min = guess + 1;
        } else {
            max = guess - 1;
        }
    }
    return -1;
}
    
public static void main(String[] args) {
    
  Scanner in = new Scanner(System.in);

int chapasC = in.nextInt();
int[] tamChapC = new int[chapasC];

for(int i = 0 ; i < chapasC ; i++){
    tamChapC[i] = in.nextInt();
}

int llavesC = in.nextInt();

StringBuilder result = new StringBuilder();

    for (int i = 0; i < llavesC; i++) {
        result.append(binarySearch(in.nextInt(), tamChapC,chapasC) + 1).append(" ");
    }
System.out.print(result.toString().trim());




}

}
