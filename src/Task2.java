//        Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран
//        сумму всех введенных чисел и завершить программу.
//        -1 должно учитываться в сумме.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array's size:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array items");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] == (-1)) {
                break;
            }
        }
        int sum = 0;
        for (int i1 = 0; i1 < array.length; i1++) {
            sum = sum + array[i1];
        }
        System.out.println("Sum " + sum);
    }
}
