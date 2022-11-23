package AVK;

import interfaces.Candy;
import interfaces.Chocolate;
import interfaces.SweetFactory;

public class AVKFactory implements SweetFactory {
    @Override
    public Candy orderCandy() {
        return new AVKCandy();
    }

    @Override
    public Chocolate orderChocolate() {
        return new AVKChocolate();
    }
}
