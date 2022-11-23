package Konti;

import interfaces.Candy;
import interfaces.Chocolate;
import interfaces.SweetFactory;

public class KontiFactory implements SweetFactory {
    @Override
    public Candy orderCandy() {
        return new KontiCandy();
    }

    @Override
    public Chocolate orderChocolate() {
        return new KontiChocolate();
    }
}
