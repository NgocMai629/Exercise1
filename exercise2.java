/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
//import java.io.IOException;
import java.util.Scanner;

public class JavaApplication2 {
    
    public static void main(String[] args) {
        int n; int tmp;
        Scanner inp = new Scanner(System.in);
        System.out.print("Input n: ");
        n = inp.nextInt();
        System.out.print("");
        for(int i = 1; i <= 10; i++){
           tmp = n * i;
           String output = String.format("%d\t*\t%d\t =\t%d\n", n, i, tmp);
          // System.out.printf("%d * %d = %d\n", n, i, tmp);
          System.out.printf(output);
       } 
    }
    
}
