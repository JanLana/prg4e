package tobiascernek;

import java.util.Scanner;

public class PocetCisel {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[] cisla = new int[100]; 
        int pocet = 0; 
        int cislo = sc.nextInt(); 
        while (cislo != 0) { 
            cisla[pocet] = cislo; 
            pocet++; 
            cislo = sc.nextInt(); 
        } 
        int nejcastejsi = cisla[0]; 
        int nejvetsiPocet = 0; 
        for (int i = 0; i < pocet; i++) { 
            int pocetCisla = 0; 
            for (int j = 0; j < pocet; j++) { 
                if (cisla[i] == cisla[j]) { 
                    pocetCisla++; 
                } 
            } 
            if (pocetCisla > nejvetsiPocet) { 
                nejvetsiPocet = pocetCisla; 
                nejcastejsi = cisla[i]; 
            } 
        } 
        System.out.println(nejcastejsi); 
    }
}
