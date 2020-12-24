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

    static class Builder {
        private Toy toy;

        public Builder build() {
            toy = new Toy();
            return this;
        }

        public Toy create() {
            return toy;
        }

        public Builder setName(String name) {
            toy.name = name;
            return this;
        }

        public Builder setHair(String hair) {
            toy.hair = hair;
            return this;
        }

        public Builder setClothes(String clothes) {
            toy.clothes = clothes;
            return this;
        }

        public Builder setPants(String pants) {
            toy.pants = pants;
            return this;
        }

        public Builder setShoes(String shoes) {
            toy.shoes = shoes;
            return this;
        }
    }
}
