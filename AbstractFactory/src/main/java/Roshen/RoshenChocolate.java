package Roshen;

import interfaces.Chocolate;

import java.util.ArrayList;
import java.util.Scanner;

public class RoshenChocolate implements Chocolate {
    ArrayList<String> chocListName = new ArrayList<>();

    public RoshenChocolate()
    {
        Scanner in = new Scanner(System.in);
        chocListName.add("Шоколад Lacmi молочний з цілим лісним горіхом");
        chocListName.add("Lacmi начинка тірамісу");
        chocListName.add("Шоколад Lacmi Bubble Nut");

        System.out.println("Обирайте товар:");
        for(int i=0; i<chocListName.size(); i++)
            System.out.println((i+1) + " - " + chocListName.get(i));
        int choc1 = in.nextInt();
        System.out.printf("Кількість товару (шт)= ");
        int choc2 = in.nextInt();

        System.out.println("\n   >Замовлення прийнято: Рошен - " + chocListName.get(choc1-1) + " - " + choc2 + " шт\n");
    }
}
