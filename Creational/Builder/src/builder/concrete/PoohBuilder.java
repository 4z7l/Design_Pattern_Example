package builder.concrete;

import builder.ToyBuilder;

public class PoohBuilder extends ToyBuilder {
    @Override
    public ToyBuilder buildName() {
        toy.setName("Pooh");
        return this;
    }

    @Override
    public ToyBuilder buildHair() {
        toy.setHair("Yellow");
        return this;
    }

    @Override
    public ToyBuilder buildClothes() {
        toy.setClothes("Red short sleeved T-shirt");
        return this;
    }

    @Override
    public ToyBuilder buildPants() {
        return this;
    }

    @Override
    public ToyBuilder buildShoes() {
        return this;
    }
}
