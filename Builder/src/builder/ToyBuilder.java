package builder;

import product.Toy;

public abstract class ToyBuilder {
    protected Toy toy;

    public Toy getToy() {
        return toy;
    }

    public ToyBuilder create() {
        toy = new Toy();
        return this;
    }

    public abstract ToyBuilder buildName();
    public abstract ToyBuilder buildHair();
    public abstract ToyBuilder buildClothes();
    public abstract ToyBuilder buildPants();
    public abstract ToyBuilder buildShoes();
}
