import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        for (i=0;i<101;i++){
            if(i%2==0){
                if(i!=100) {
                    System.out.print(i + ", ");
                }
                else{
                    System.out.print(i + ".");
                }
            }
        }
        System.out.println();
        for (i=0;i>-101;i--){
            if (i%2!=0){
                if(i!=-99) {
                    System.out.print(i + ", ");
                }
                else {
                    System.out.print(i + ".");
                }
            }
        }
    }
}
/*Ввести границы, шаг, числокоторомукратно*/