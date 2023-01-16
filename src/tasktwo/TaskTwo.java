/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasktwo;

import java.util.Scanner;

/**
 *
 * @author Adonay
 */
public class TaskTwo {

    /**
     * @param args the command line arguments
     */
/*Write a program which reads three integers (say, a, b and c), then prints these three
numbers: System.out.println(a + " " + b + " " + c);
and then rearranges the values in these variables in such a way that a contains the
smallest of the three numbers, b — the middle one, and c — the largest. Print again
System.out.println(a + " " + b + " " + c);
and you shoud see the same three numbers, but in ascending order.
Any two (or all three) numbers may be equal. Not using arrays or Strings!*/

    public static void main(String[] args) {
        int a,b, c;
        int bMaxUno, cMaxUno;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entering numbers");
        System.out.print("a: ");
        a = entrada.nextInt();
        System.out.print("b: ");
        b= entrada.nextInt();
        System.out.print("c: ");
        c = entrada.nextInt();
        System.out.println("Numbers introduced: ");
        System.out.println(a + " " + b + " " + c + " ");
        System.out.println("Numbers rearranged: " );
                
         if(a<=c && b<=c){
            cMaxUno = c;
          System.out.println(a + " " + b + " " + cMaxUno + " ");
          
         }
         else if(c<a && c<=b){
             bMaxUno = b;
             System.out.println(c + " " + bMaxUno + " " + a + " ");
         }
         else if(a<=c && b>c){
            bMaxUno = b;
            System.out.println(a + " " + c + " " + bMaxUno + " ");
         }
        
        
    }
   
}
