package se.alex.lexicon;

public class ArrayCopy {
    public static void main(String[] args) {

        // Declare and initialize the first array
        int[] firstArray = {1, 15, 20};


        //Creating the second array will be the same length as the first
        int[] secondArray = new int[firstArray.length];


        //Copy elements from first to second
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];

        }


        //printing out
        System.out.println("Element from first array ");
        for (int element : firstArray) {
            System.out.println(element + ",");
        }

        System.out.println("Element from second array ");
        for (int element : secondArray) {
            System.out.println(element + ",");

        }


    }

}