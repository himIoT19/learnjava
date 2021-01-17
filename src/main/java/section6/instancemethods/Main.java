package section6.instancemethods;

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog jackie = new Dog("jackie"); // create instance (jackie)
        Dog chinu = new Dog("chinu");  // create instance (chinu)

        jackie.printName(); // prints jackie
        chinu.printName();  // prints chinu
    }
}
