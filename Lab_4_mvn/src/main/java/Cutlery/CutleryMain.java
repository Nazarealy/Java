package Cutlery;

public class CutleryMain {     //main class

    private double price;      //price
    private double rating;     //rating
    private String material;   //material
    private String production; //production


    public CutleryMain() {     //constructor(default)
    }

    public CutleryMain(final double price,
                       final double rating,
                       final String material,
                       final String production) {
        this.price = price;
        this.rating = rating;
        this.material = material;
        this.production = production;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final double getRating() {
        return rating;
    }

    public final void setRating(final double rating) {
        this.rating = rating;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }

    public final String getProduction() {
        return production;
    }

    public final void setProduction(final String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "CutleryMain{"
                +
                "price=" + price
                +
                ", rating=" + rating
                +
                ", material='" + material + '\''
                +
                ", production='" + production + '\''
                +
                '}';
    }
}