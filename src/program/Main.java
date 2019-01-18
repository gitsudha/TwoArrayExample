package program;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Print's size of arguments

        System.out.println("args size=" + args.length);
        /*
         * printing aruguments
         * another line
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }

        int addition = sum(2, 3);
        System.out.println("sum of 2 and 3 is=" + addition);


        int[] sortedArray = sortArray(new int[]{1, 2, 3, 4, 5});


        System.out.println("sorted values are " + Arrays.toString(sortedArray));

        int a[] = new int[5];
        int[] b = new int[6];
        int c[] = {1, 2, 3, 4, 5, 6};
        int[] d = new int[]{1, 2, 3, 4, 5};
//    int [] e = new [6] int;
//    int [] f = new [] int {1,2,3,4,5,6};
        int[] g = new int[]{1, 2, 3};
        int[] h = new int[]{1, 2, 3};

        // Two dimensional array


        int a1[][] = new int[][]{{1, 2}, {1, 2}};
        int b1[][] = {{1, 2, 3}, {1, 2, 3}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(b1[i][j]);
            }
        }

        Class arrayClass = b1.getClass();
        System.out.println("I am printing h array class name" + arrayClass.getName());
    }
/**
 * calculates sum of two integers
 * @param a operand
 * @param b operand
 * @return sum of a and b
 */
        public static int sum(int a,  int b){
            return  a+b;
        }

        public static int[] sortArray(int[] arrayOfNumbers){

            int [] array = arrayOfNumbers;
            int tempArray;
            for (int i = 1;i<array.length;i++){
                for (int j = i;j>0;j--){
                    tempArray = array[j];
                    array[j] = array[j-1];
                    array[j-1]=tempArray;
                }

            }
            return array;
        }

    }










