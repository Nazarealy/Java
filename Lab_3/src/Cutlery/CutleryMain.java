package Cutlery;

public class CutleryMain {

    private double price;
    private double rating;
    private String material;
    private String production;


    public CutleryMain(){
    }

    public CutleryMain(double price, double rating, String material, String production) {
        this.price = price;
        this.rating = rating;
        this.material = material;
        this.production = production;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "CutleryMain{" +
                "price=" + price +
                ", rating=" + rating +
                ", material='" + material + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}