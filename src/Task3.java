package _1_procedural;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        int[] array1 = new int [] {5, 9, 3, 8};
        int[] array2 = new int [] {1, 2, 6, 7, 4,};
        int[] array3 = new int[array1.length + array2.length];
        int j, a;

        System.out.println("Массив 1");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println();
        System.out.println("Массив 2");
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        j = 0;
        for (int i = 0; i < array1.length; i++, j++){
            array3[j] = array1[i];
        }
        for (int i = 0; i < array2.length; i++, j++){
            array3[j] = array2[i];
        }

        System.out.println();
        System.out.println("Массив 3");
        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }

        for (int i = array3.length - 1; i > 0; i--){
            for (j = i; j < array3.length; j++){
                if ( array3[j-1] > array3[j] ) {
                    a = array3[j-1];
                    array3[j-1] = array3[j];
                    array3[j] = a;
                } else break;
            }
        }

        System.out.println();
        System.out.println("Массив 3 отсортированный");
        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }
    }
}