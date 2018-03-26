/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.IOException;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Input n: ");
        n = inp.nextInt();
        System.out.print("");
        for (int i = 2; i <= n; i++) {
           if (primesNumber(i)) System.out.print(i + " ");
        }
    }
    public static boolean primesNumber(int n){
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
            }
         if (dem == 2) {
            return true;
        }
         else {
            return false;
        }
        }
    
    
    }
    


