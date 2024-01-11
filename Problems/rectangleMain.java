import java.util.Scanner;

public class rectangleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Input Height of Rectangle: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        display(scanner, rectangle);
    }

    static void display(Scanner scanner, Rectangle rectangle) {
        System.out.println("What do you want to calculate?");
        System.out.println("Press 1 for area, 2 for perimeter: ");

        if (choice(scanner) == 1) {
            area(rectangle);
        }

        else {
            perimeter(rectangle);
        }
    }
    
    static int choice(Scanner scanner) {
        int choice;
        choice = scanner.nextInt();
        
        return choice;
    }

    static void area(Rectangle rectangle) {
        System.out.println("The Area of the Rectangle: "+rectangle.area());
    }

    static void perimeter(Rectangle rectangle) {
        System.out.println("The Perimeter of the Rectangle: "+rectangle.perimeter());
    }
}
