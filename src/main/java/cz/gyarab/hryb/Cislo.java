/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.gyarab.hryb;

/**
 *
 * @author ASUS
 */

import java.io.File;
import java.util.Scanner;

public class Cislo {
    public static void main(String[] args) throws Exception {
        Scanner soubor = new Scanner(new File("cisla.txt"));
        int[] cisla = new int[1000];
        int pocet = 0;
        while (soubor.hasNextInt()) {
            cisla[pocet] = soubor.nextInt();
            pocet++;
        }
        soubor.close();
        int maxCislo = cisla[0];
        int maxPocet = 0;

        for (int i = 0; i < pocet; i++) {
            int pocetOpakovani = 0;
            for (int j = 0; j < pocet; j++) {
                if (cisla[i] == cisla[j]) {
                    pocetOpakovani++;
                }
            }
            if (pocetOpakovani > maxPocet) {
                maxPocet = pocetOpakovani;
                maxCislo = cisla[i];
            }
        }
        System.out.println(maxCislo);
    }
}
