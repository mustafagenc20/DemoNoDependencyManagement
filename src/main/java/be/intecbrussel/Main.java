package be.intecbrussel;

public class Main {
    public static void main(String[] args) {
        SomeService service = new SomeService(ApplicationContext.getDependency());
        SomeService anotherInstanceOfService = new SomeService(ApplicationContext.getDependency());
    }
}
