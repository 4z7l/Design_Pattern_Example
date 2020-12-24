package builder;

public class ZzangGuBuilder extends ToyBuilder {
    @Override
    public ToyBuilder buildName() {
        toy.setName("ZzangGu");
        return this;
    }

    @Override
    public ToyBuilder buildHair() {
        toy.setHair("Short black");
        return this;
    }

    @Override
    public ToyBuilder buildClothes() {
        toy.setClothes("Red short sleeved T-shirt");
        return this;
    }

    @Override
    public ToyBuilder buildPants() {
        toy.setPants("Yellow shorts");
        return this;
    }

    @Override
    public ToyBuilder buildShoes() {
        toy.setShoes("Yellow");
        return this;
    }
}
