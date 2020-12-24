package creator.concrete;

import creator.abst.ShapeCreator;
import product.abst.Shape;
import product.concrete.Rectangle;

public class RectangleCreator extends ShapeCreator {
    @Override
    public Shape create() {
        System.out.println("Create Rectangle...");
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle...");
    }
}
