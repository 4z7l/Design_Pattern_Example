import creator.concrete.CircleCreator;
import creator.concrete.RectangleCreator;
import product.abst.Shape;

public class Main {
    public static void main(String[] args) {
        CircleCreator circleCreator = new CircleCreator();
        RectangleCreator rectangleCreator = new RectangleCreator();

        Shape circle = circleCreator.createShape();
        circle.print();

        Shape rectangle = rectangleCreator.createShape();
        rectangle.print();
    }
}
