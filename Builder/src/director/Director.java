package director;

import builder.ToyBuilder;
import product.Toy;

public class Director {
    private ToyBuilder toyBuilder;

    public void setToyBuilder(ToyBuilder toyBuilder) {
        this.toyBuilder = toyBuilder;
    }

    public Toy constructToy() {
        return toyBuilder.create()
                .buildName()
                .buildHair()
                .buildClothes()
                .buildPants()
                .buildPants()
                .getToy();
    }
}
