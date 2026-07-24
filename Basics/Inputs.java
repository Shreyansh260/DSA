
import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");


        System.out.println("Enter your height in meters: ");
        float height = sc.nextFloat();
        System.out.println("Your height is " + height + " meters.");


        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);
        System.out.println("Your grade is " + grade + ".");
        sc.close();

    }
    
}
