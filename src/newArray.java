import java.util.Arrays;
import java.util.Scanner;

public class newArray {
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
        System.out.println(Arrays.toString(array));

        int[] newArr = new int[oddNums];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                newArr[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}