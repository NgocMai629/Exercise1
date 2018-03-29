/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

public class Exercise1{

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        
        
        int i = 2, dem = 0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Input n: ");
                n = Integer.parseInt(inp.nextLine());
                if (n > 0) {
                    while (dem < n) {
                        if (primesNumber(i)) {
                            System.out.print(i + " ");
                            dem++;
                        }
                        i = i + 1;
                    }                   
                    flag = true;
                } else {
                    flag = false;
                    System.out.println("Please input a positive number!");               
                }
            } catch (NumberFormatException e) {
                flag = false;
                System.out.println("Please input a positive number!");
            }
        }
    }
    public static boolean primesNumber(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            return true;
        } else {
            return false;
        }
    }

}
    


