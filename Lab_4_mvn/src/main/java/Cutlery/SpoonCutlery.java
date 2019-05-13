package Cutlery;

public class SpoonCutlery extends CutleryMain {

    private int lenght;
    private String color;

    public SpoonCutlery() {
    }

    public SpoonCutlery(double price, double rating, String material, String production, int lenght, String color) {
        super(price, rating, material, production);
        this.lenght = lenght;
        this.color = color;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SpoonCutlery{" +
                "lenght=" + lenght +
                ", color='" + color + '\'' +
                '}';
    }
}
