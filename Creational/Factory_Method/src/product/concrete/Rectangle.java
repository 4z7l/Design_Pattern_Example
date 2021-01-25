package product.concrete;

import product.abst.Shape;

public class Rectangle implements Shape {
    @Override
    public void print() {
        System.out.println(">> Rectangle\n");
    }
}
