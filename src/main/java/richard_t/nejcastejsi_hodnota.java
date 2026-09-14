package richard_t;

public class nejcastejsi_hodnota {
    static void main() {
        int[] cisla = {258, 76, 94, 465, 8, 19, 258, 76, 92, 84, 76};
        System.out.println(nejcastejsi_hodnota(cisla));

    }

    static int nejcastejsi_hodnota(int[] pole) {
        int nejvetsi_vyskyt = 0;
        int nejcastejsi_hodnota = 0;
        int[] pocet = new int[pole.length];

        for (int i = 0; i < pole.length; i++) {
            for (int j = i; j < pole.length; j++) {
                if (pole[i] == pole[j]) {
                    pocet[i] += 1;
                }
            }
            if (nejvetsi_vyskyt < pocet[i]) {
                nejvetsi_vyskyt = pocet[i];
                nejcastejsi_hodnota = pole[i];
            }
        }
        return nejcastejsi_hodnota;
    }

}
