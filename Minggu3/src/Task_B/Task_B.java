/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_B;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Hafifah
 */
public class Task_B {
    
    public static void main(String[] args) {
        int deret = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan Deret Array : ");
        deret = scan.nextInt();

        for (int i = 0; i <= deret - 1; i++) {
            int[] rndm = new int[deret];
            rndm[i] = random.nextInt(100);
            System.out.print(rndm[i] + " ");
        }
        System.out.println("");
    }
}   
