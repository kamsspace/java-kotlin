package java-generics;

public class GenericsApp {
    
    public static Stack<String> makeStackString(Stack<String> strings) {
        strings.push("Hello");
        strings.push("World");

        return strings;
    }

    public static Stack<Integer> makeStackInteger(Stack<Integer> ints) {
        ints.push(5);
        ints.push(3);
        ints.push(2);
        ints.push(1);
        ints.push(1);

        return ints;
    }

    public static Stack<SportsCar> makeStackSportsCar(Stack<SportsCar> cars) {
        cars.push(new SportsCar("Tesla Roadster", 250, true));
        cars.push(new SportsCar("Tesla Model S", 250, true));
        cars.push(new SportsCar("Tesla Model 3", 250, true));
        cars.push(new SportsCar("Tesla Model X", 250, true));
        cars.push(new SportsCar("Tesla Model Y", 250, true));

        return cars;
    }

    public static void printStackRaw(Stack stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void raceStackRaw(Stack stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            ((SportsCar)e).race();
        }
    }

    public static void printStackObjects(Stack<Object> stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void printStackInteger(Stack<Integer> stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void printStackString(Stack<String> stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void printStackSportsCar(Stack<SportsCar> stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void printStackCar(Stack<Car> stack) {
        for(Object e = stack.pop(); e != null; e = stack.pop()) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // create stacks of different types
        Stack<Integer> ints = new StackArray<>();
        Stack<String> strings = new StackArray<>();
        Stack<SportsCar> racers = new StackArray<>();

        // print them out raw ... it works
        printStackRaw(makeStackInteger(ints));     
        printStackRaw(makeStackString(strings));   
        printStackRaw(makeStackSportsCar(racers)); 

        // but this is why we use Generics, instead of raw types...
        raceStackRaw(makeStackInteger(ints));     // blows up
        raceStackRaw(makeStackString(strings));   // blows up
        raceStackRaw(makeStackSportsCar(racers)); // actually works
        
        // but this is why we use Generics, and since Object defines println
        // we can use Stack<Object>, right? No.
        printStackObjects(makeStackInteger(ints));     // blows up
        printStackObjects(makeStackString(strings));   // blows up
        printStackObjects(makeStackSportsCar(racers)); // blows up

        // the compiler demands that we have EXACT matching type
        printStackInteger(makeStackInteger(ints));
        printStackString(makeStackString(strings));
        printStackSports(makeStackSportsCar(racers));

        // it won't even let us use Car because we have SportsCar
        printStackCar(makeStackSportsCar(racers)); // blows up

    }
}
