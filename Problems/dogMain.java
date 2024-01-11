import java.util.Scanner;

public class dogMain {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog(null, null);

        String dogName = dog.getName(scanner);
        String dogBreed = dog.getBreed(scanner);

        System.out.println(dog.dispName(dogName)+ " is a breed of "+dog.dispBreed(dogBreed));

        evolve(dog, scanner, dogName, dogBreed);
    }

    static void evolve(Dog dog, Scanner scanner, String dogName, String dogBreed) {

        System.out.println("Do You Want "+dogName+" To Evolve? Press Y/N..");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            dogBreed = dog.setBreed(scanner);
            System.out.println("Shet! "+dog.dispName(dogName)+" evolved and is now a breed of "+dog.dispBreed(dogBreed)+"!");
        }

        else {
            System.out.println("Sad, "+dogName+ " Will Die a "+dogBreed);
        }
        
    }
}