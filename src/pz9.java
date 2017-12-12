import java.util.*;
public class pz9 {
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
        //Пузырёк
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    tempValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempValue;
                }
            }
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

        //Перестановка
        for (i=0;i<10;i++){
            for (j=i+1;j<10;j++){
                if (array[i] < array[j]) {
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        System.out.println("");
        System.out.println("Сортировка перестановкой: ");

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
