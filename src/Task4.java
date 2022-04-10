//          Напишите программу, которая запрашивает числа.
//          Программа должна остановиться запрашивать, когда мы вводим 0.
//          Программа должна вывести максимальное значение из всех чисел.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] ==0) {
                break;
            }
        }

        int max = array[0];
        int maxIndex = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                maxIndex = j;
            }
        }System.out.println("Biggest num is: " + array[maxIndex]);
    }
}