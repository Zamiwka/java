package oop.inheritance.aggregation;

public class Car {
    private  String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

