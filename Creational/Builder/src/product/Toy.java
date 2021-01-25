package product;

public class Toy {
    private String name;
    private String hair;
    private String clothes;
    private String pants;
    private String shoes;

    public void setName(String name) {
        this.name = name;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "<" + name + ">\n" +
                "hair = " + hair + '\n' +
                "clothes = " + clothes + '\n' +
                "pants = " + pants + '\n' +
                "shoes = " + shoes + '\n';
    }
}
