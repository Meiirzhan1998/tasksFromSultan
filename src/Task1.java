//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник
//        размером m на n из восьмёрок.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи m:");
        int m = sc.nextInt();
        System.out.println("Введи n:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(8 + "  ");
            }
            System.out.println();
        }
    }
}
