/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Friends;

import java.util.Scanner;

/**
 *
 * @author Kandang
 */
public class ScannerRudi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner bebas= new Scanner(System.in);
        System.out.println("Masukan nilai a");
        a= bebas.nextInt();
        System.out.println("Masukan nilai b");
        b= bebas.nextInt();
        c= a*b;
        System.out.println("Maka nilai c adalah " +c);
        
      
    }
    
}
