package Cutlery;

public class SpoonCutlery extends CutleryMain {

    private int lenght;
    private String color;

    public SpoonCutlery() {
    }

    public SpoonCutlery(final double price,
                        final double rating,
                        final String material,
                        final String production,
                        final int lenght,
                        final String color) {
        super(price, rating, material, production);
        this.lenght = lenght;
        this.color = color;
    }

    public String getHeaders() {
        return super.getHeaders() + ","
                + "lenght" + ","
                + "color";
    }

    public String toCSV() {
        return super.toCSV() + ","
                + this.lenght + ","
                + this.color;
    }


    public final int getLenght() {
        return lenght;
    }

    public final void setLenght(final int lenght) {
        this.lenght = lenght;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SpoonCutlery{"
                +
                "lenght=" + lenght
                +
                ", color='" + color + '\''
                +
                '}';
    }
}
