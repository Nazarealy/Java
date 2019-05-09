package Cutlery;

public class SpoonCutlery {

    private int lenght;
    private String color;

    public SpoonCutlery() {
    }

    public SpoonCutlery(int lenght, String color) {
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
