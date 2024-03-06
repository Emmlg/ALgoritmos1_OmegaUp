/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch.B;

import java.util.Scanner;

/**
 *
 * @author EMmanuel
 */

    

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger{

    public static int fibonacciPosition(BigInteger numero) {

        BigInteger actual = BigInteger.ONE, anterior = BigInteger.ZERO;
        int pos = 0;

        if (numero.compareTo(BigInteger.ONE) <= 0) {
            return numero.intValue();
        }

        while (actual.compareTo(numero) < 0) {
            BigInteger fibNum = actual.add(anterior);
            anterior = actual;
            actual = fibNum;
            pos++;
        }

        if (actual.equals(numero)) {
            return pos + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(fibonacciPosition(sc.nextBigInteger()));
    }


    
}
