package java-generics;

public class SportsCar extends Car{
    public SportsCar(String name, int, speed, boolean engineState) {
        super(name, speed, engineState);
    }

    public void race() {
        setSpeed(300);
    }
}
