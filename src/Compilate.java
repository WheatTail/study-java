import java.util.Scanner;

public class Compilate {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        while(true) {
            System.out.println("Главное меню");
            System.out.println("Введите номер работы");
            System.out.println("1) Какая-то сортировка");
            System.out.println("2) Кратное pz7");
            System.out.println("3) Ввод-вывод массива 8");
            System.out.println("4) Сортировка пузырьком/перестановкой 9");
            System.out.println("5) Сортировка пухырьком 11");
            System.out.println("6) Вычисление определителя (under construction)");
            System.out.println("7) Поиск индекса по числу 13");
            switch (reader.nextInt()){
                case 1:
                    Main a = new Main();
                    a.main(args);
                    a = null;
                    break;
                case 2:
                    pz7 b = new pz7();
                    b.main(args);
                    b = null;
                    break;
                case 3:
                    pz8 c = new pz8();
                    c.main(args);
                    c = null;
                    break;
                case 4:
                    pz9 d = new pz9();
                    d.main(args);
                    d = null;
                    break;
                case 5:
                    pz11 e = new pz11();
                    e.main(args);
                    e = null;
                    break;
                case 6:
                    System.out.println("Сказано же - не работает");
                    break;
                case 7:
                    pz13 f = new pz13();
                    f.main(args);
                    f = null;
                    break;
                default:
                    System.out.println("Нет такого");
                    System.exit(0);
            }
            System.gc();
        }
    }
}