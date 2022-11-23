package Roshen;

import interfaces.Candy;
import interfaces.Chocolate;
import interfaces.SweetFactory;

public class RoshenFactory implements SweetFactory {
    @Override
    public Candy orderCandy() {
        return new RoshenCandy();
    }

    @Override
    public Chocolate orderChocolate() {
        return new RoshenChocolate();
    }
}
