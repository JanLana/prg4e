import java.io.File;
import java.util.Scanner;
public class cislohled {
    public static void main(String [] args) throws Exception {
        Scanner soubor = new Scanner(new File(System.getProperty("user.dir") + "\\src\\cisla.txt"));
        int[] cisla = new int[1000];
        int pocet = 0;

        while (soubor.hasNextInt()) {
            cisla[pocet] = soubor.nextInt();
            pocet++;
        }
        soubor.close();

        int nejCislo = cisla[0];
        int nejPocet = 0;

        for (int i = 0; i < pocet; i++) {

            int pocetOpakovani = 0;

            for (int j = 0; j < pocet; j++) {
                if (cisla[i] == cisla[j]) {
                    pocetOpakovani++;
                }
            }

            if (pocetOpakovani > nejPocet) {
                nejPocet = pocetOpakovani;
                nejCislo = cisla[i];
            }
        }

        System.out.println(nejCislo);
    }

}
