/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_D;

import java.util.Scanner;

/**
 *
 * @author Hafifah
 */
public class Task_D {
    public static void main(String[] args) {
        String nama;
        int sum = 0;
        int [] price = new int [6];
        System.out.println("-------------------------------------");
        System.out.println("    Kharisma Agung Plaza < KAP >   ");
        System.out.println("      Promo Belanja Berhadiah         ");
        System.out.println("Khusus Pembelanjaan 5 Barang Pertama");
        System.out.println("   Dengan Harga Minimum Rp.100.000    ");
        System.out.println("---------------------------------------");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        
        System.out.println("");
        
        for(int i = 1; i < price.length; i++) {
            System.out.print("Masukkan Harga Barang ke- "+i+" : ");
            price[i] = scan.nextInt();
        }
        for ( int num : price) {
            sum = sum+num; 
        }
        System.out.println("Total Harga Pembelian Atas Nama "+nama+" adalah "+sum);
        System.out.println("");
        if(sum > 99999) {
            System.out.println("Selamat...");
            System.out.println("Anda Mendapatkan Hadiah 1 Buah Mug Cantik");
        }else{
            System.out.println("Ayo Tambah Belanjaan Anda Agar Mendapat Hadiah");
        }
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("Anda Sudah Belanja di Kharisma Agung Plaza");
    }
    
}
