import java.util.*;

public class pz12 {
    static Random random = new Random(System.currentTimeMillis());
    static Scanner reader = new Scanner(System.in);
    static int range = reader.nextInt();
    static int newRange = 0;
    static int determ=0;
    //static int count=0;
    public static void main(String[] args){
        int i, j, tmp, determ = 0;
        int[][] array = new int[range][range];
        int[][] arrayt = new int[range][range];
        for (i = 0; i < range; i++){
            for (j=0;j<range;j++){
                array[i][j]=random.nextInt(100);
            }
        }
        for (i = 0; i < range; i++) {
            for (j = 0; j < range; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспонирование:");
        for (i = 0; i < range; i++) {
            for (j = 0; j < range; j++) {
                arrayt[i][j]=array[j][i];
            }
        }
        for (i = 0; i < range; i++) {
            for (j = 0; j < range; j++) {
                System.out.print(arrayt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Определитель: " + det(array));

    }
    public static int[][] arrayWOij(int array[][],int rowNum, int coloumnNum){
        int i, j, range=array.length-1, ni=0, nj=0;
        int lowArray[][] = new int[range][range];
        System.out.println("Минор: ");
        for (i=0;i<range;i++){
            if (i==rowNum){
                ni=1;
            }
            nj=0;
            for (j=0;j<range;j++){
                if(j==coloumnNum){
                    nj=1;
                }
                lowArray[i][j]=array[i+ni][j+nj];
            }
        }
        for (i=0;i<range;i++){
            for (j=0;j<range;j++){
                System.out.print(lowArray[i][j] + " ");
            }
            System.out.println();
        }
        return lowArray;
    }

    public static int det(int[][]  lowArray){
        int k=1, i;
        int a=0;
        if(lowArray.length==1){
            determ+=lowArray[0][0];
            System.out.println("Определитель 1х1: " + determ);
            //return determ;
        }
        else{
            if(lowArray.length==2){
                a+=lowArray[0][0]*lowArray[1][1]-lowArray[1][0]*lowArray[0][1];
                determ+=a;

                System.out.println("Определитель 2х2: " + a);
                //return determ;
            }
            else{
                k=1;
                for (i=0;i<lowArray.length;i++){
                    a+=k*lowArray[0][i]*det(arrayWOij(lowArray,0,i));
                    determ+=a;
                    System.out.println("Определитель nxn: " + a);
                    k=-k;
                }
            }
        }
        return determ;
    }
}
