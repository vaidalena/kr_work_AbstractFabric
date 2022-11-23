package AVK;

import interfaces.Candy;

import java.util.ArrayList;
import java.util.Scanner;

public class AVKCandy implements Candy {
    ArrayList<String> candyListName = new ArrayList<>();

    public AVKCandy()
    {
        Scanner in = new Scanner(System.in);
        candyListName.add("Королівський шарм");
        candyListName.add("Trufalie");
        candyListName.add("Шоколадна ніч");

        System.out.println("Обирайте товар:");
        for(int i=0; i<candyListName.size(); i++)
            System.out.println((i+1) + " - " + candyListName.get(i));
        int candy1 = in.nextInt();
        System.out.printf("Вага товару (кг)= ");
        int candy2 = in.nextInt();

        System.out.println("\n   >Замовлення прийнято: АВК - " + candyListName.get(candy1-1) + " - " + candy2 + " кг\n");
    }
}
