package se.iths.exercise;

public class Exercise8 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 3, 4};
        //1,2,1,3,3,4   Everywhere
        //1,2,1,3,4,5   Somewhere
        //1,2,3,4,5,6   Nowhere

        boolean Everywhere = true;
        boolean Somewhere = false;

        for (int i = 0; i < numbers.length - 3; i += 2) {

            if (numbers[i] == numbers[i + 2] || numbers[i + 1] == numbers[i + 3] ||
                numbers[i] == numbers[i + 3] || numbers[i + 1] == numbers[i + 2]) {
                Somewhere = true;
            } else {
                Everywhere = false;
            }


        }
        if (Everywhere) {
            System.out.println("everywhere");
        }else if (Somewhere) {
            System.out.println("somewhere");
        }else {
            System.out.println("nowhere");
        }





    }
}
