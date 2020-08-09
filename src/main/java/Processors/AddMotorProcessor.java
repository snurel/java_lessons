package Processors;

public class AddMotorProcessor implements CarProcessor, CarRunner {
    private double volume;
    private int mass;

    public AddMotorProcessor(double volume, int mass) {
        this.volume = volume;
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getMass() {
        return mass;
    }

    public void process() {
        System.out.println("AddMotorProcessor started!");
    }

    public String getColor() {
        return "grey";
    }

    public void runCar() {

    }
}
