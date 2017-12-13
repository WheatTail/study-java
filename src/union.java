import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class union {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        Set<String> stringSet = new HashSet<String>();
        stringSet.add(reader.next());
        stringSet.add(reader.next());
        stringSet.add(reader.next());
        stringSet.add(reader.next());
        stringSet.add(reader.next());
        for (String entry: stringSet){
            System.out.print(entry+ " ");
        }
        System.out.println("Что проверяем?");
        if(stringSet.contains(reader.next())){
            System.out.println("Exist");
        }
        else {
            System.out.println("Not exist");
        }
    }
}
