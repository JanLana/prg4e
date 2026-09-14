package adamhruska;

public class HledaniCisel {
    public static void main(String[] args) {
        int[] cisla = {5, 2, 7, 1, 7, 3, 7, 4, 6, 0};

        int maxCetnost = 0;
        int nejcastejsiCislo = 0;

        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] == 0) {
                break;
            }

            int cetnost = 0;
            for (int j = 0; j < cisla.length; j++) {
                if (cisla[j] == 0) {
                    break;
                }
                if (cisla[j] == cisla[i]) {
                    cetnost++;
                }
            }

            if (cetnost > maxCetnost) {
                maxCetnost = cetnost;
                nejcastejsiCislo = cisla[i];
            }
        }

        if (maxCetnost > 0) {
            System.out.println("Nejčastější číslo " + nejcastejsiCislo + " (četnost: " + maxCetnost + ").");
        }
    }
}