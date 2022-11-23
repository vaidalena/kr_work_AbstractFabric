package Konti;

import interfaces.Candy;

import java.util.ArrayList;
import java.util.Scanner;

public class KontiCandy implements Candy {
    ArrayList<String> candyListName = new ArrayList<>();

    public KontiCandy()
    {
        Scanner in = new Scanner(System.in);
        candyListName.add("Золота лілія");
        candyListName.add("Belissimo");
        candyListName.add("Carre Amour");

        System.out.println("Обирайте товар:");
        for(int i=0; i<candyListName.size(); i++)
            System.out.println((i+1) + " - " + candyListName.get(i));
        int candy1 = in.nextInt();
        System.out.printf("Вага товару (кг)= ");
        int candy2 = in.nextInt();

        System.out.println("\n   >Замовлення прийнято: Конті - " + candyListName.get(candy1-1) + " - " + candy2 + " кг\n");
    }
}
