package generics;

public class GenericsApp {
    
    public static void main(String[] args) {
        Stack<Integer> ints = new GenericStackImpl();
        Stack<String> strings = new GenericStackImpl();

        if(ints.getClass() == strings.getClass())
        System.out.printf("Stack<Integer> and Stack<String> are both %s\n", ints.getClass());

        strings.push("Hello");
        strings.push("World");

        ints.push(5);
        ints.push(3);
        ints.push(2);
        ints.push(1);
        ints.push(1);
    }
}
