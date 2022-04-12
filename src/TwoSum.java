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

        for (int i = 0; i < array.length; i++) {
            randNum = min + (int) (Math.random() * ((max - min) + 1));
            array[i] = randNum;
        }

        System.out.println("Enter your target from array: " + Arrays.toString(array));
        int target = sc.nextInt();
        System.out.println("target = " + target);

        int idx1 = 0;
        int idx2 = 1;
        for (int i = array.length; i > 0; i--) {
            if (array[idx1] + array[idx2] == target) {
                System.out.print("[" + idx1 + ", " + idx2 + "]");
            }
            idx1++;
            idx2++;
        }
        System.out.println("The End");
    }
}


