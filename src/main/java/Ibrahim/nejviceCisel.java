package Ibrahim;

public class nejviceCisel {

    public static int inverzniPole(int[] arr) {

        int[] novePole = new int[2000];

        for (int i = 0; i < arr.length; i++) {
            novePole[arr[i] + 1000] += 1;
        }

        int max = 0;

        for (int i = 0; i < novePole.length; i++) {

            if (novePole[i] > max) {
                max = novePole[i];
            }

        }

        return max;
    }

    static void main() {

        int[] pole = {-2, -2, -2, -2, 2, 1, 4, 2, 3, 2, 3};

        int vysledek = inverzniPole(pole);

        System.out.println(vysledek);
    }
}