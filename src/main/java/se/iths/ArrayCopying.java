package se.iths;

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);

        System.out.println("a[]");
        System.out.println("{" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "}");
        System.out.println("b[]");
        System.out.println("{" + b[0] + "," + b[1] + "," + b[2] + "," + b[3] + "}");
        //System.out.println(Arrays.toString(b));
        a[0]++;
        System.out.println("a[]");
        System.out.println("{" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "}");
        System.out.println("b[]");
        System.out.println("{" + b[0] + "," + b[1] + "," + b[2] + "," + b[3] + "}");

    }

    private static void variables() {
        int a = 10;
        int b = a;

        System.out.println("a  |  b");
        System.out.println("-------");
        System.out.println(a + " | " + b);
        System.out.println();
        a++;

        System.out.println("a  |  b");
        System.out.println("-------");
        System.out.println(a + " | " + b);
    }
}
