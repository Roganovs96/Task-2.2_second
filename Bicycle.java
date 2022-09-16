public class Bicycle extends Vehicle{

//    public String modelName;
//    public int wheelsCount;


    public Bicycle() {
    }

    public Bicycle(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}