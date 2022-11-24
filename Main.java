package Zadanie7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int action;

        Cat[] cat = new Cat[3];
        cat[0] = new Cat ("Alex", 5, 0);
        cat[1] = new Cat ("Kitty", 5, 0);
        cat[2] = new Cat ("Nick", 5, 0);

        Plate plate = new Plate(20);
        plate.info();
        for (int i = 0; i < cat.length; i++){
            if (cat[i].fullness == 0 && cat[i].getAppetite() < plate.getFood()){
                cat[i].eat(plate);
                cat[i].fullness = 1;
                System.out.println("Кот: " + cat[i].getName() + " не голоден");}
                    else {
                System.out.println("Кот: " + cat[i].getName() + " голодный");

            }

        }

        plate.info();
        System.out.println("Положите коту еды-->");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.info();
        for (int i = 0; i < 5; i++){
            if (plate.getFood() > cat[i].getAppetite()) {
                System.out.println("Ура, в тарелке есть еда");
                break;
            }
            else {
                System.out.println("Еды не хватает");//ПОМОГИТЕ ДАЛЬШЕ РЕАЛИЗОВАТЬ КОД С НЕХВАТКОЙ ЕДЫ!!!

            }
        }
        scanner.close();
    }
}
