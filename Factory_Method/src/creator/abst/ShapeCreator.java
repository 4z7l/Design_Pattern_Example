package creator.abst;

import product.abst.Shape;

public abstract class ShapeCreator {

    public Shape createShape(){
        Shape shape = create();
        draw();
        return shape;
    }

    /* factory method */
    public abstract Shape create();

    /* operation */
    public abstract void draw();
}
