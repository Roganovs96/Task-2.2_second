public class Car extends Bicycle{

//    private String modelName;
//    private int wheelsCount;

    public Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    public Car(){

    }



    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}