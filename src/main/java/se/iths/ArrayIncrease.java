package se.iths;

import java.util.Arrays;

public class ArrayIncrease {

    public static void main(String[] args) {
        //Skapa en array med 3 platser
        //Lägg in 3 värden i arrayen
        int[] a = {1,2,3};

        //Lägg till ett 4:e värde i arrayen?
        //Skapa ny array med 4 platser och kopiera information
        int[] temp = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;

        a[3] = 4;

        System.out.println(Arrays.toString(a));

    }
}
