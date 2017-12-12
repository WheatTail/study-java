import java.util.*;

public class pz13 {
    static Random random = new Random(System.currentTimeMillis());
    static Scanner reader = new Scanner(System.in);
    static int search = 0;
    static int index = -1;
    public static void main(String[] args) {
        int i, j, tmp;
        int range = reader.nextInt();
        int[] array=new int[range];
        for (i=0;i<range;i++){
            array[i]=random.nextInt(50);
        }
        System.out.println("Оригинальный массив: ");
        for (i=0;i<range;i++){
            System.out.print(array[i]+" ");
        }

        for (i=0;i<range;i++){
            for (j=1;j<range-i;j++){
                if (array[j] < array[j-1]) {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (i=0;i<range;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Какое число ищем?");
        search=reader.nextInt();
        for (i=0;i<range;i++){
            if(array[i]==search){
                index=i;
                index++;
                break;
            }
        }
        if (index!=-1){
            System.out.println("Искомое число на "+index+" позиции.");
        }
        else {
            System.out.println("Этого числа в массиве нет.");
        }
        System.out.println("Бинарный поиск");
        index=-1;
        System.out.println("Какое число ищем теперь?");
        int newSearch = reader.nextInt();
        int low = 0;
        int high = range - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (array[mid] > newSearch){
                high = mid - 1;
            }
            else if (array[mid] < newSearch) {
                low = mid + 1;
            }
            else {
                index = mid;
                break;
            }
        }
        /*int m;
        i=0;
        j=range-1;
        for (m=0;m<range;m++){
            if (newSearch>array[j+(i-j)/2]){
                j=j+(i-j)/2;
            }
            else if (newSearch<array[j+(i-j)/2]){
                i=j+(i-j)/2;
            }
            else {
                index=j+(i-j)/2;
                break;
            }
        }*/
        index++;
        System.out.println("Искомое число на "+index+" позиции.");
    }
}