package cz.gyarab.klouda;

public class NejCislo {
    static void main() {
        int[] arr = new int[]{1,2,3,3,5,4,8,7,2,2,2,1,-5,-78,-5,-5,-5,-5,-5,-5};
        System.out.println(nejCisla(arr));
    }

    static int nejCisla(int[] arr){
        int nejmensi = 0;
        int nejvetsi = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<nejmensi){nejmensi=arr[i];}
            if(arr[i]>nejvetsi){nejvetsi=arr[i];}
        }
        int[] invArr = new int[nejvetsi+Math.abs(nejmensi)+1];
        int nejIndex = 0;
        for(int j=0;j<arr.length;j++){
            invArr[arr[j]+Math.abs(nejmensi)]++;
            if(invArr[arr[j]+Math.abs(nejmensi)]>invArr[nejIndex]){
                nejIndex = arr[j]+Math.abs(nejmensi);
            }
        }
        return nejIndex-Math.abs(nejmensi);
    }
}
