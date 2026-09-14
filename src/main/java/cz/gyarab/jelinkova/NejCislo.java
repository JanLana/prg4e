package cz.gyarab.jelinkova;

public class NejCislo {
    static void main() {
        int[] arr = new int[] {
                1,2,3,-5, 3 -10, 9, 9, 9, 9, -851, -50, 8, 9, -20, -20
        };
        System.out.println(nej(arr));
    }

    static int nej(int[] arr) {
        int nejmensi = 0;
        int nejvetsi = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > nejvetsi) {
                nejvetsi = arr[i];
            }
            if(arr[i] < nejmensi) {
                nejmensi = arr[i];
            }
        }
        int[] arr2 = new int[nejvetsi + Math.abs(nejmensi)+1];

        int nejIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            int cislo = arr[i];
            arr2[cislo + Math.abs(nejmensi)] += 1;
            if(arr2[cislo + Math.abs(nejmensi)] > arr2[nejIndex]) {
                //System.out.println(nejIndex);
                nejIndex = cislo + Math.abs(nejmensi);
            }
        }

        return nejIndex + nejmensi;
    }
}
