import java.util.Scanner;

public class pz1 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Введите два числа");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c=a+b;
        System.out.println("+: "+ c);
        c=a-b;
        System.out.println("-: "+ c);
        c=a*b;
        System.out.println("*: "+c);
        c=a/b;
        System.out.println("/: "+c);
    }
}
