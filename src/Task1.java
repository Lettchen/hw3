package _1_procedural;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int [] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int a;
        System.out.println("Массив до сдвига");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        for (int i = array1.length-1; i > 0 ; i--){
            a = array1[i];
            array1[i] = array1[i-1];
            array1[i-1] = a;
        }
        System.out.println();
        System.out.println("Массив после сдвига");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
    }
}