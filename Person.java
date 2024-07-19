public class Person {
    private final String name;
    private final int age;
    private final String address;

    // Constructor to initialize the fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    // Method to accept a Person object and call its displayDetails method
    public void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to pass the current instance to myDetails method
    public void printCurrentInstance() {
        myDetails(this);
    }

    // Main method to create an object and call the printCurrentInstance method
    public static void main(String[] args) {
        Person edith = new Person("Edith", 25, "123 Kisumu");
        edith.printCurrentInstance();
    }
}
