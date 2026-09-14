package org.example.Petricek;



public class NejviceCisel {

    public static int nejviceCisel(int[] pole) {

        int nejvice = pole[0];
        int maxPocet = 0;

        for (int i = 0; i < pole.length; i++) {

            int pocet = 0;

            for (int j = 0; j < pole.length; j++) {
                if (pole[i] == pole[j]) {
                    pocet++;
                }
            }

            if (pocet > maxPocet) {
                maxPocet = pocet;
                nejvice = pole[i];
            }
        }

        return nejvice;
    }

    public static void main(String[] args) {

        int[] pole = {1, 3, 2, 3, 2, 3, 3, 4};

        int vysledek = nejviceCisel(pole);

        System.out.println("Nejvíce se vyskytuje číslo: " + vysledek);
    }
}