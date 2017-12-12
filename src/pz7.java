import java.util.*;
public class pz7 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        int i, upbound, bottombound, div, uplast, bottomlast;
        System.out.println("Нижняя граница:");
        bottombound=reader.nextInt();
        System.out.println("Верхняя граница:");
        upbound=reader.nextInt();
        System.out.println("Чему должно быть кратно:");
        div=reader.nextInt();
        uplast=bottomlast=0;
        for (i=upbound-div;i<=upbound;i++){
            if(i%div==0){
                uplast=i;
            }
        }
        for (i=bottombound-div;i<=bottombound;i++){
            if(i%div==0){
                bottomlast=i;
            }
        }
        if (upbound>bottombound){
            for (i=bottombound;i<=upbound;i++){
                if(i%div==0){
                    if (i!=uplast) {
                        System.out.print(i + ", ");
                    }
                    else {
                        System.out.print(i + ".");
                    }
                }
            }
        }
        else{
            for (i=upbound;i<=bottombound;i++){
                if(i%div==0){
                    if (i!=bottomlast) {
                        System.out.print(i + ", ");
                    }
                    else{
                        System.out.print(i + ".");
                    }
                }
            }
        }
    }
}
