package ua.zp.brainacademy;

import java.util.Arrays;

public class Lab4Test {
    public static void main(String[] args) {
        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.
        firstArray [0] = 20.5f;
        firstArray [1] = 25.5f;
        firstArray [2] = 30.3f;
        firstArray [3] = 35.2f;
        for (float v : firstArray) {
            System.out.println(v);
        }
        System.out.println();

        // TODO insert some value to start of array and to end of array.

        int[] intArray = {1, 1, 2, 3, 5, 8, 13, 21}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // TODO copy "intArray". Use copyOf...

        // 1.3)
        Arrays.sort(intArrayCopy); // TODO sort "intArrayCopy", use Arrays sort.

        // 1.4)
        System.out.println(Arrays.toString(intArrayCopy)); // TODO print "intArrayCopy", use Arrays toString.

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        Arrays.equals(intArray, intArrayCopy);
        if(intArray == intArrayCopy){
            System.out.println("Arrays equals");
        }else {
            System.out.println("Arrays not equals");
        };
        System.out.println();

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};
        for(int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        };
        System.out.println();

        // Print array values in cycle.
        for (int value: testArray) {
            System.out.println(value + " ");
        }
        System.out.println();

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int calcSum = 0;
        for (int i = 0; i < testArray.length; i++) {
            calcSum += testArray[i];
        }
        System.out.println(calcSum);
        System.out.println();
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int calcOdd = 0;
        for (int i = 0; i < testArray.length; i++) {
            if(testArray[i] % 2 != 0){
                calcOdd += testArray[i];
            }
        }
        System.out.println(calcOdd);
        System.out.println();
        // 2.3)
        // TODO find max value in array.
        int maxValue = testArray[8];
        for (int i = 0; i < testArray.length; i++) {
            if(testArray[i] > maxValue){
                maxValue = testArray[i];
            }
        }
        System.out.println(maxValue);
        // PART 3
        System.out.println();
        //3.1
        // TODO create two-dimensional array with size [3][4]
        int [][] matrixx = new int[3][4];
        int sumMatrix = 0;

        //3.2
        // TODO fill array with any numbers in cycles.
        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[i].length; j++) {
                matrixx[i][j] = i + 3 & j + 4;
                System.out.print(matrixx[i][j] + "\t");
                sumMatrix += matrixx[i][j];
            }
            System.out.println();
        }
        System.out.println();

        //3.3
        // TODO calc sum of all array elements and print result.
        System.out.println(sumMatrix);
        System.out.println();
        // PART 4*
        //Filling array
        long[][] matrix = new long[9][9];
        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }
        //Calculate min and max numbers in row
        int[] array = new int[2];
        int count = 0;
        for(int i = 2; i <= 5; i += 2){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j += 3){
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();
            array[count] = sum;
            count++;
        }
        int min = array[0];
        int max = array[1];


        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);

        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
    }
}
