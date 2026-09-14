package org.example.MatyasBrtan;

public class hledani_cisel {
    public static void main(String[] args) {
        int[] cisla = {1, 2, 3, 4, 5, 5, 4, 5, 5 ,5 ,5 ,5, 5, 0};

        int nejvetsiCislo = 0;
        int nejvetsiCetnost = 0;

        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] == 0) {
                break;
            }

            int pocet = 0;

            for (int j = 0; j < cisla.length; j++) {
                if (cisla[j] == 0) {
                    break;
                }

                if (cisla[i] == cisla[j]) {
                    pocet++;
                }
            }

            if (pocet > nejvetsiCetnost) {
                nejvetsiCetnost = pocet;
                nejvetsiCislo = cisla[i];
            }
        }

        System.out.println("Nejvetsi cetnost ma cislo: " + nejvetsiCislo + " (" + nejvetsiCetnost + "x)");
    }
}
