/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;
//import java.io.IOException;
import java.util.Scanner;

public class exercise2 {
    
    public static void main(String[] args) {
        int n; int tmp;
        Scanner inp = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Input n: ");
                n = Integer.parseInt(inp.nextLine());
                if (n > 1 && n < 10 ) {
                    for(int i = 1; i <= 10; i++){
                    tmp = n * i;
                    String output = String.format("%8s * %4s =%4s\n", n, i, tmp);
                    System.out.printf(output);
                    flag = true;
                }
                }else 
                {
                    flag = false;
                    System.out.println("Please input integer number in the range of 2 to 9!");  
                }
            }catch (NumberFormatException e) {
                flag = false;
                System.out.println("Please input integer number in the range of 2 to 9!");
            }
        }
       } 
    }

