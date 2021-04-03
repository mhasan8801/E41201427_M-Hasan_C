/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Scanner;

/**
 *
 * @author Hafifah
 */
public class TugasA {
    public static void main(String[] args) {
        int bil_awal, bil_akhir;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama : ");
        bil_awal = scan.nextInt();
        System.out.print("Masukkan bilangan terakhir : ");
        bil_akhir = scan.nextInt();
        System.out.print("\n");

        if (bil_awal > bil_akhir) {
            System.out.print("Mohon maaf bilangan pertama tidak boleh lebih besar dari bilangan terakhir");
        } else if (bil_awal % 2 == 1 & bil_awal == bil_akhir) {
            System.out.print("Mohon maaf tidak ada bilangan genap");
        } else {
            for (int i = bil_awal; bil_awal <= bil_akhir; bil_awal++) {
                if (bil_awal % 2 == 0) {
                    System.out.print(bil_awal + " ");
                }
            }
        }
        System.out.println("\n");
    }
}
