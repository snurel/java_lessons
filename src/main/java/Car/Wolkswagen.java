package Car;

public class Wolkswagen extends Car {
    private int animal;

    public Wolkswagen() {
    }

    public int getAnimal() {
        return animal;
    }

    public void setAnimal(int animal) {
        this.animal = animal;
    }

    @Override
    public String getInfo() {
        return "This is a wolkswagen!";
    }
}
