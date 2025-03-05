package java-generics;

public class Car {
    public Car(String name, int speed, boolean engineState) {
        this.speed = speed;
        this.name = name;
        this.engineState = engineState;
    }

    private int speed;
    private String name;
    private boolean engineState;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isEngineState() {
        return engineState;
    }
    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }
}
