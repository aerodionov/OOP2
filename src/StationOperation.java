public interface StationOperation {
    void changeWheels(int wheelsCount);
    void checkEngine();
    void checkTrailer();
    void check(Bicycle bicycle);

    void check(Car car);

    void check(Truck truck);
    void aboutOperation(String transportModelName);
}
