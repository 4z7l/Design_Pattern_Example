public class Main {

    public static void main(String[] args) {
        Toy pooh = new Toy.Builder()
                .build()
                .setName("Pooh")
                .setHair("Yellow")
                .setClothes("Red short sleeved T-shirt")
                .create();

        Toy zzangGu = new Toy.Builder()
                .build()
                .setName("ZzangGu")
                .setHair("Short black")
                .setClothes("Red short sleeved T-shirt")
                .setPants("Yellow shorts")
                .setShoes("Yellow")
                .create();

        System.out.println(pooh);
        System.out.println(zzangGu);
    }
}
