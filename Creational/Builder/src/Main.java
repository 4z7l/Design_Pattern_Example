import builder.concrete.PoohBuilder;
import builder.concrete.ZzangGuBuilder;
import director.Director;
import product.Toy;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        PoohBuilder poohBuilder = new PoohBuilder();
        ZzangGuBuilder zzangGuBuilder = new ZzangGuBuilder();

        //director.setToyBuilder(poohBuilder);
        director.setToyBuilder(zzangGuBuilder);

        Toy toy = director.constructToy();

        System.out.println(toy);
    }
}
