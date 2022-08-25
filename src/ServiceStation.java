public class ServiceStation implements StationOperation {

    public void changeWheels(int wheelsCount) {
            for (int i = 0; i < wheelsCount; i++) {
                System.out.println("Меняем покрышку");
            }
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(Bicycle bicycle) {
        aboutOperation(bicycle.getModelName());
        changeWheels(bicycle.getWheelsCount());
    }

    public void check(Car car) {

        aboutOperation(car.getModelName());
        changeWheels(car.getWheelsCount());
        checkEngine();
    }

    public void check(Truck truck) {

        aboutOperation(truck.getModelName());
        changeWheels(truck.getWheelsCount());
        checkEngine();
        checkTrailer();
    }

    public void aboutOperation(String transportModelName) {
        System.out.println("Обслуживаем " + transportModelName);
    }


}
