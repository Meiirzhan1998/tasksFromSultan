import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];

        int min = 1;
        int max = 20;
        int randNum;
        int oddNums = 0;

        for (int i = 0; i < array.length; i++) {
            randNum = min + (int) (Math.random() * ((max - min) + 1));
            array[i] = randNum;
            if (array[i] % 2 != 0) {
                oddNums++;
            }
        }

        System.out.println("Enter your target from array: " + Arrays.toString(array));
        int target = sc.nextInt();
        System.out.println("target = " + target);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] + array[i] == target) {
                    System.out.print("[" + i + ", " + j + "],");
                }
            }
        }
    }
}


