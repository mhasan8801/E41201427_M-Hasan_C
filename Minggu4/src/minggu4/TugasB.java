/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Hafifah
 */
public class TugasB {
    public static void main(String[] args) {
       int kelipatan = 1;
        int perkalian = 1;
        System.out.println("=========Do__While==========");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        do {
            kelipatan = kelipatan * 2;
            if (kelipatan <= 100) {
                System.out.print(" " + kelipatan + " ");
            }
        } while (kelipatan <= 100);
        System.out.println("\n");
        System.out.println("Perkalian 2 tiap bilangan (1-100)");
        System.out.println("============================");
        do {
            System.out.print(" " + perkalian + " ");
            perkalian = perkalian * 2;
        } while (perkalian <= 100);
        System.out.print("\n");
        System.out.println("===========================");
    }  
}
