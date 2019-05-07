abstract class Car {
    abstract void run();
}
class Bike extends Car{
    void run() {
        System.out.println("自行车在行驶");
    }
}

class Bus extends Car{
    void run() {
        System.out.println("公交车在运行");
    }
}
public class CarBus {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
        Bus bus = new Bus();
        bus.run();
    }
}
