//        Программа запрашивает число n.
//        Далее, мы вводим n чисел и сохраняем все введенные числа в массив.
//        Выведите в конце элементы массива, которые больше среднего арифметического.

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];

        System.out.print("Enter array items: ");
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int arrItem = sc.nextInt();
            array[i] = arrItem;
            j = j + array[i];
        }
        System.out.println(Arrays.toString(array));
        int middle = j / arrSize;
        System.out.println("Middle: " + middle);
        System.out.print("Элементы массива, которые больше среднего арифметического: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > middle) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
