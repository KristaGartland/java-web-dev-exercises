package exercises.controlflowandcollections;


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args){
        int[] numberArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        String[] commas = phrase.split(",");
        String[] periods = phrase.split("\\.");

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(commas));
        System.out.println(Arrays.toString(periods));
        for (int i = 0; i < numberArray.length; i++){
                System.out.println(numberArray[i]);

        }



















    }


}
