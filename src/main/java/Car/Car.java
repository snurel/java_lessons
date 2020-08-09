package Car;

public class Car {
    private String name;
    private String engine;
    private double engineVolume;
    protected String color;

    public Car() {
        this.color = "white";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getInfo(){
        return "This is a car";
    }


}
