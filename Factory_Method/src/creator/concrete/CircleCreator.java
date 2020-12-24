package creator.concrete;

import creator.abst.ShapeCreator;
import product.abst.Shape;
import product.concrete.Circle;

public class CircleCreator extends ShapeCreator {
    @Override
    public Shape create() {
        System.out.println("Create Circle...");
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle...");
    }
}
