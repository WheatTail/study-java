import java.util.*;
public class pz8 {
    static Scanner reader=new Scanner(System.in);
    public static void main(String[] args){
        int i;
        int[] array= new int[10];
        i=0;
        while(i<10){
            array[i]=reader.nextInt();
            i++;
        }
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
