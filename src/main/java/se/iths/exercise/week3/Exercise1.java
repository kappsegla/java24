package se.iths.exercise.week3;

public class Exercise1 {

    public static void main(String[] args) {

        int [] number = {3, 4, 5};

        //number[0] = 74846;
        //number[1] = 56;
        //number[2] = 4766;

        evenOrOdd(number);
    }
    public static void evenOrOdd(int[] input){
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0){
                throw new RuntimeException("Det finns udda siffror!");
            }
        }
    }
}
