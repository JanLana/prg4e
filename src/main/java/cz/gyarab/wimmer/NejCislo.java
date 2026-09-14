package wimmer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NejCislo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> poctyCisel = new HashMap<>();

        while (sc.hasNext()) {

            int cislo = sc.nextInt();

            if (!poctyCisel.containsKey(cislo))
                poctyCisel.put(cislo, 1);
            else
                poctyCisel.put(cislo, poctyCisel.get(cislo) + 1);
        }

        int nejCislo = 0, pocetTohoCisla = 0;

        for (Map.Entry<Integer, Integer> cislo : poctyCisel.entrySet())
            if (cislo.getValue() > pocetTohoCisla)
                nejCislo = cislo.getKey();

        System.out.println("Nej Cislo: " + nejCislo + " [" + pocetTohoCisla + " krat ve vstupu]");
    }
}
