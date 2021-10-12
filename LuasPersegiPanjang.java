/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Friends;

/**
 *
 * @author Kandang
 */
import java.util.Scanner;
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        int panjang, lebar, luas;
    Scanner bebas= new Scanner(System.in);
    
        System.out.println("Menghitung luas persegi panjang");
        System.out.println("Masukan nilai panjang");
        panjang = bebas.nextInt();
        System.out.println("Masukan nilai lebar");
        lebar = bebas.nextInt();
        luas =panjang *lebar;
        System.out.println("luas = "+ luas);
        
        
         
    }
    
}
