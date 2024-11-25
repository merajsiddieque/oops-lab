package lab8;

import java.util.Arrays;

public class Client {

    public static int[] processArray(int[] inputArray) {
        Function halfFunction = new Half();

        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = halfFunction.evaluate(inputArray[i]);
        }

        return resultArray; 
    }

    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] halvedNumbers = processArray(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Halved array: " + Arrays.toString(halvedNumbers));
    }
}
