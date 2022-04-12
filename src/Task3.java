////         Напишите программу, которая принимает целое число (int n)
////         и показывает сумму первых n чисел
////         из последовательности 1, 3, 5, 7, 9, 11, 13, 15, 17...

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
//        int i = 0;
//        int j = 0;
//        while (j < n) {
//            if (i % 2 != 0) {
//                sum = sum + i;
//                j++;
//            }
//            i++;
//        }
    int j=0;
        for(int i = 0; j<n; i++){
            if(i%2 != 0){
                sum += i;
                j++;
            }
        }
        System.out.println("Result sum: " + sum);
    }
}








