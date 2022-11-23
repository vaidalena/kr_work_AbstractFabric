package Konti;

import interfaces.Chocolate;

import java.util.ArrayList;
import java.util.Scanner;

public class KontiChocolate implements Chocolate {
    ArrayList<String> chocListName = new ArrayList<>();

    public KontiChocolate()
    {
        Scanner in = new Scanner(System.in);
        chocListName.add("Шоколад Конті Amour з апельсином");
        chocListName.add("Шоколад Конті Amour гіркий");
        chocListName.add("Шоколад Конті Dolci молочний");

        System.out.println("Обирайте товар:");
        for(int i=0; i<chocListName.size(); i++)
            System.out.println((i+1) + " - " + chocListName.get(i));
        int choc1 = in.nextInt();
        System.out.printf("Кількість товару (шт)= ");
        int choc2 = in.nextInt();

        System.out.println("\n   >Замовлення прийнято: Конті - " + chocListName.get(choc1-1) + " - " + choc2 + " шт\n");
    }
}
