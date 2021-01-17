package section6.oops1.staticmethods;

class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog jackie = new Dog("jackie");
        Dog chinu = new Dog("chinu");

        jackie.printName(); // prints chinu
        chinu.printName();  // prints chinu
    }
}
