package _1_procedural;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        int[] array1 = new int [] {5, 9, 3, 8, 4, 5, 6, 7, 8, 9, 1 , 2, 3}; //массив как есть
        int j;
        System.out.println("Массив до удаления дубликатов");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println();
        System.out.println("Массив после удаления дубликатов");
        for (int i = 0; i < array1.length; i++){
            for (j = i + 1; j < array1.length; j++){
                if ( array1[i] == array1[j] ) break;
            }
            if ( j == array1.length ) System.out.println(array1[i]);
        }
    }
}