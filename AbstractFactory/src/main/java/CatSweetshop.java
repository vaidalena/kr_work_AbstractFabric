import AVK.AVKFactory;
import Konti.KontiFactory;
import Roshen.RoshenFactory;
import interfaces.SweetFactory;
import java.util.Scanner;

public class CatSweetshop {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int menu = 0;

        SweetFactory sweetFactory;

        System.out.println("1-АВК\n2-Конті\n3-Рошен\n?");
        menu = in.nextInt();

        switch (menu)
        {
            //АВК
            case 1:
            {
                int m;
                sweetFactory = new AVKFactory();
                getSweet(sweetFactory);
                break;
            }
            //Конті
            case 2:
            {
                int m;
                sweetFactory = new KontiFactory();
                getSweet(sweetFactory);
                break;
            }
            //Рошен
            case 3:
            {
                int m;
                sweetFactory = new RoshenFactory();
                getSweet(sweetFactory);
                break;
            }
        }
    }

    public static void getSweet(SweetFactory factory)
    {
        int m;
        System.out.println("1-цукерки\n2-шоколад\n?");
        m = in.nextInt();

        switch (m)
        {
            //цукерки
            case 1:
            {
                factory.orderCandy();
                break;
            }
            //шоколад
            case 2:
            {
                factory.orderChocolate();
                break;
            }
        }
    }
}
