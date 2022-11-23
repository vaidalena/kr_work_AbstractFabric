package AVK;

import interfaces.Chocolate;

import java.util.ArrayList;
import java.util.Scanner;

public class AVKChocolate implements Chocolate {
    ArrayList<String> chocListName = new ArrayList<>();

    public AVKChocolate()
    {
        Scanner in = new Scanner(System.in);
        chocListName.add("Шоколад АВК Молочний");
        chocListName.add("Шоколад АВК Чорний");
        chocListName.add("Шоколад АВК Екстрачорний");

        System.out.println("Обирайте товар:");
        for(int i=0; i<chocListName.size(); i++)
            System.out.println((i+1) + " - " + chocListName.get(i));
        int choc1 = in.nextInt();
        System.out.printf("Кількість товару (шт)= ");
        int choc2 = in.nextInt();

        System.out.println("\n   >Замовлення прийнято: АВК - " + chocListName.get(choc1-1) + " - " + choc2 + " шт\n");
    }
}
