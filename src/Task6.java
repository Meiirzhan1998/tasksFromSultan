//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке,
//        каждое значение выводить с новой строки.

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter array items: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.print("Элементы массива в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
