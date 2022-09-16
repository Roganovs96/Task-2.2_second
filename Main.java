public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("Ferrari");
        car2.setModelName("Volkswagen");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);
//        car.modelName = "car1";
//        car2.modelName = "car2";
//        car.wheelsCount = 4;
//        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truc1");
        truck2.setModelName("truc2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

//        truck.modelName = "truck1";
//        truck2.modelName = "truck2";
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;
//
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

//        bicycle.modelName = "bicycle1";
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;
//
        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
 }
}