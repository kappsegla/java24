package se.iths;


import java.nio.charset.StandardCharsets;

public class Variables {

    public static void main(String[] args) {
        int variableName = 10;
        int variableValue = 2_147_483_647;

        System.out.println(variableValue);
        variableValue = variableValue + 1;

        char kebabCase = 'A';
        System.out.println(kebabCase);
        kebabCase = (char) (kebabCase + 1);
        System.out.println(kebabCase);

        String text = "😒";
        System.out.println(text.getBytes(StandardCharsets.UTF_8).length);

        double length = 1.86;
        System.out.println(length);

        float pi = 3.14159236f;
        System.out.println(pi);

        float dollar = 1.3f;
        System.out.println(dollar);
        System.out.printf("%.10f\n", dollar);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println("MaxInteger: " + maxInteger);
        float maxFloat = maxInteger;
        System.out.println("MaxFloat:" + maxFloat);

        float findTheGap = 16777216.0f;
        System.out.println(findTheGap);
        System.out.printf("%.2f\n", findTheGap);

        final int DAYS_IN_WEEK = 7;
        System.out.println("Every week has " + DAYS_IN_WEEK + " days");

        int i = 127;
        byte b = (byte) i;

        float milkPrice = 14.45f;

        int price = (int) (milkPrice + 0.5f);
        System.out.println(price);


        int evenOrOdd = 3;
        System.out.println(evenOrOdd % 2);
        evenOrOdd = 6;
        System.out.println(evenOrOdd % 2);

        final int change = 432;
        int temp = change;
        //Calculate the amount of different bills that should be returned as change
        System.out.println("Number of 500 bills: " + temp / 500);
        temp = temp % 500;
        System.out.println("Number of 200 bills: " + temp / 200);
        temp = temp % 200;
        System.out.println("Number of 100 bills: " + temp / 100);
        temp = temp % 100;
        System.out.println("Number of 50 bills: " + temp / 50);
        temp = temp % 50;
        System.out.println("Number of 20 bills: " + temp / 20);
        temp = temp % 20;
        System.out.println("Number of 10 kronor: " + temp / 10);
        temp = temp % 10;
        System.out.println("Number of 5 kronor: " + temp / 5);
        temp = temp % 5;
        System.out.println("Number of 1 kronor: " + temp / 1);
        temp = temp % 1;

        //This gives us the same result as change % 500
        System.out.println(change - (500 * (change / 500)));


    }

}
