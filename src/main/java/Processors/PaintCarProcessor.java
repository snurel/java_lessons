package Processors;

public class PaintCarProcessor implements CarProcessor {
    private String color;

    public PaintCarProcessor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void process() {
        System.out.println("PaintCarProcessor started!");
    }
}
