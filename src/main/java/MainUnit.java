import Car.*;
import Processors.AddMotorProcessor;
import Processors.CarRunner;
import Processors.CarProcessor;
import Processors.PaintCarProcessor;

import java.util.ArrayList;

public class MainUnit {
    public static void main(String[] args) {
        Wolkswagen wolks = new Wolkswagen();
        Opel opel = new Opel("cat");
        Vosvos vosvos = new Vosvos();

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(opel);
        cars.add(vosvos);
        cars.add(wolks);

        Car car = new Wolkswagen();
        Car car2 = new Opel("dog");

        System.out.println(wolks.getInfo());
        System.out.println(opel.getInfo());
        System.out.println(vosvos.getInfo());


        CarProcessor processor1 = new AddMotorProcessor(1.2, 1000);
        CarProcessor processor2 = new PaintCarProcessor("red");

        CarRunner runner = new AddMotorProcessor(2.0, 3000);
        runner.runCar();
    }
}