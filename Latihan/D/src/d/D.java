/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.util.Scanner;

/**
 *
 * @author Hafifah
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //buat scanner
        Scanner s1 = new Scanner(System.in);
        
        //ambil nilai dari keyboard
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
        //hitung dan print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
    
