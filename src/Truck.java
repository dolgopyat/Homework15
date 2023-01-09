public class Truck extends Car implements Competing{

    public Truck(String brand, String model, double engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начнал движение.");
    }

    @Override
    public void finish() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заехал на питстоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel() + " -...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " -...");
    }
}
