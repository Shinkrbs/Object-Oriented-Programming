import java.util.Scanner;

public class Dog {

    Scanner scanner = new Scanner(System.in);
    public String breed;
    public String name;

    Dog(String name, String breed) {
        this.name =  name;
        this.breed = breed;
    }

    String getName(Scanner scanner) {
        System.out.println("Input Name of Dog: ");
        name = scanner.nextLine();
        return name;
    }

    String getBreed(Scanner scanner) {
        System.out.println("Input Breed of Dog");
        breed = scanner.nextLine();
        return breed;
    }

    String setBreed(Scanner scanner) {
        System.out.println("Input New Breed of Dog: ");
        breed = scanner.nextLine();
        return breed;
    }

    String dispName(String name) {
        this.name = name;
        return name;
    }

    String dispBreed(String breed) {
        this.breed = breed;
        return breed;
    }
}
