//         Напишите программу, которая принимает целое число (int n)
//         и показывает сумму первых n чисел
//         из последовательности 1, 3, 5, 7, 9, 11, 13, 15, 17...

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array's size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter number: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
