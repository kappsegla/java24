package se.iths;


import java.nio.charset.StandardCharsets;
import java.util.Locale;

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
        System.out.printf("%.10f\n",dollar);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println("MaxInteger: " + maxInteger);
        float maxFloat = maxInteger;
        System.out.println("MaxFloat:" + maxFloat);

        float findTheGap = 16777216.0f;
        System.out.println(findTheGap);
        System.out.printf("%.2f\n",findTheGap);




    }

}
