import java.util.*;

public class pz11 {
    static Random random = new Random(System.currentTimeMillis());
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        int i, j, tempValue;
        int[] array = new int[10];
        i = j = tempValue = 0;
        while(i<10){
            array[i]= random.nextInt(100);
            i++;
        }
        while (i<10){
            while (j<10){
                if (array[j] > array[j + 1]) {
                    tempValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempValue;
                    j++;
                }
                j++;
            }
            j=0;
            i++;
        }
        System.out.println("Сортировка пузырьком: ");
        i=0;
        do {
            if(i==0) {
                System.out.print(array[i]);
                i++;
            }
            else {
                System.out.print(", "+array[i]);
                i++;
            }
        } while (i<10);
        System.out.print(".");
    }
}
