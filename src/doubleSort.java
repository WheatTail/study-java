import java.util.Random;
import java.util.Scanner;

public class doubleSort {
    static Random random = new Random(System.currentTimeMillis());
    static Scanner reader = new Scanner(System.in);
    static int search = 0;
    static int index = -1;

    public static void main(String[] args) {
        int i, j, tmp, cmp;
        int range = reader.nextInt();
        int[] array = new int[range];
        for (i = 0; i < range; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println();
        System.out.println("Оригинальный массив: ");
        for (i = 0; i < range; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (i = 0; i < range; i++) {
            for (j = 1; j < range; j++) {
                cmp = compare(array[j - 1], array[j]);
                if (cmp == 1) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (i = 0; i < range; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Какой элемент ищем: ");
        int search=reader.nextInt();
        int low = 0;
        int high = range - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (compare (search, array[mid])==-1){
                high = mid - 1;
            }
            else if (compare (search, array[mid])==1) {
                low = mid + 1;
            }
            else {
                index = mid;
                break;
            }
        }
        index++;
        System.out.println("Это число на позиции "+index);
    }

    public static int compare(int a, int b) {
        int cmpResult = 0;
        if (a == b) {
            return cmpResult;
        }
        if (a % 2 == 0 && b % 2 != 0) {
            cmpResult = -1;
        } else if (a % 2 != 0 && b % 2 == 0) {
            cmpResult = 1;
        }
        if (cmpResult == 0) {
            if (a > b) {
                cmpResult = -1;
            } else cmpResult = 1;
        }
        return cmpResult;
    }
}
