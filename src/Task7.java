//        1. Создать массив на 15 целых чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Пускай индекс элемента массива является номером дома,
//        а значение - числом жителей, проживающих в доме.
//        Дома с нечетными номерами расположены на одной стороне улицы,
//        с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//        4. Вывести на экран сообщение: "В домах с нечетными номерами проживает
//        больше жителей." или "В домах с четными номерами проживает больше жителей."

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        System.out.println("Enter array items: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                idx1 += arr[i];
            }
            if (i % 2 == 0) {
                idx2 += arr[i];
            }
        }
        if (idx1 > idx2) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
