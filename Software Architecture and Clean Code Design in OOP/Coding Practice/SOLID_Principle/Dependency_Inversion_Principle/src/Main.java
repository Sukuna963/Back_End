public class Main {
    public static void main(String[] args) throws Exception {
        ElectricEngine electricEngine = new ElectricEngine();
        GasolineEngine gasolineEngine = new GasolineEngine();
        
        Car car1 = new Car(electricEngine);
        Car car2 = new Car(gasolineEngine);

        car1.start();
        car2.start();
    }
}
