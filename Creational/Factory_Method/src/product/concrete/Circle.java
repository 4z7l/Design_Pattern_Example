package product.concrete;

import product.abst.Shape;

public class Circle implements Shape {
    @Override
    public void print() {
        System.out.println(">> Circle\n");
    }
}
