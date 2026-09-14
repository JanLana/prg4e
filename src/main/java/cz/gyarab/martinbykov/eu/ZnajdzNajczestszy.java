/// Autor: Martin Bykov
/// martinbykov.eu
/// Wszystkie prawa zastrzeżone.

package cz.gyarab.martinbykov.eu;

import java.util.ArrayList;

/// @brief Zawiera metody dla odnalezenia najczęstszego numeru w tablicy.
public class ZnajdzNajczestszy {
    /// @brief Znajdzie najczęstszy numer w tablicy, w czasie linearnym.
    /// @exception Nie wyrzuca wyjątków.
    /// @return Najczęstszy numer w tablicy. Jeżeli w tablicy jest więcej niż jeden numer z taką samą liczbą wystąpień, wraca ten, na który natrafi jako pierwszy.
    public static Integer najczestszyNumer(ArrayList<Integer> array) {
        if(array.size() == 1) return array.get(0);

        int min = (int) Double.POSITIVE_INFINITY, max = (int) Double.NEGATIVE_INFINITY;
        for (Integer i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        int offset = -min;
        ArrayList<Integer> inverted = new ArrayList<>(Math.abs(max - min)+1);
        for(int i = 0; i < Math.abs(max - min)+1; i++) inverted.add(0);
        inverted.add((int)Double.NEGATIVE_INFINITY);
        int maxInverted = inverted.size()-1; //we use last elem for worst value (to avoid another if in loop)

        for (Integer i : array) {
            int value = inverted.get(i + offset);
            inverted.set(i + offset, value + 1);

            if (value > inverted.get(maxInverted)) maxInverted = i + offset;
        }

        return maxInverted - offset;
    }

    /// @brief Uruchamia kilka przypadków testowych dla algorithmu.
    /// @exception Może rzucić wyjątek jeżeli algorytm popelni błąd (nie powinien)
    public static void prostePrzypadkiTestowe() throws Exception {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-1);
        nums.add(-1);
        nums.add(-1);
        nums.add(-1);
       
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
       
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(7);
        nums.add(6);

        if(najczestszyNumer(nums) != -1) throw new Exception("First test case failed!");

        ArrayList<Integer> nums2 = new ArrayList<>();
       
        nums2.add(0);
        nums2.add(1);
        nums2.add(2);
        nums2.add(2);
        nums2.add(3);
        nums2.add(3);

        nums2.add(-1);
        nums2.add(-1);
        nums2.add(-1);
        nums2.add(-1);
        nums2.add(-1);
       
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        nums2.add(7);
        nums2.add(6);

        if(najczestszyNumer(nums2) != -1) throw new Exception("Second test case failed!");

        ArrayList<Integer> nums3 = new ArrayList<>();
       
        nums3.add(0);
        nums3.add(1);
        nums3.add(2);
        nums3.add(2);
        nums3.add(3);
        nums3.add(3);

        nums3.add(1);
        nums3.add(100);
        nums3.add(-100);
        nums3.add(-1000);
        nums3.add(1000);
       
        nums3.add(3);
        nums3.add(4);
        nums3.add(5);
        nums3.add(7);
        nums3.add(6);

        if(najczestszyNumer(nums3) != 3) throw new Exception("Third test case failed!");

        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.addAll(nums);
        nums4.addAll(nums2);
        nums4.addAll(nums3);

        if(najczestszyNumer(nums4) != -1) throw new Exception("Fourth test case failed!");
    }

    /// @brief Uruchamia przypadki testowe osobnie od reszty program. Zobacz dokumentację funkcji simpleTestCases()
    /// @see FindMostCommon.simpleTestCases();
    public static void main(String[] args) throws Exception {
        prostePrzypadkiTestowe();
    }
}
