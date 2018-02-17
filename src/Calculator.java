import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Program : Simple calculator \n");
        System.out.println(" 1. Addition \n");
        System.out.println(" 2. Subtraction \n");
        System.out.println(" 3. Multiplication \n");
        System.out.println("Enter your choice : ");
        int choice = userInput.nextInt();

        switch(choice){

            case 1 :
                System.out.println("You have chosen addition\n");

                System.out.println(" Enter your first number :");
                int number1 = numberInput.nextInt();
                System.out.println("\nEnter your Second Number :");
                int number2 = numberInput.nextInt();
                int sum = number1 + number2;
                System.out.println("\n The Sum of the two numbers is : "+sum);
                break;

            case 2 :
                System.out.println("You have chosen subtraction \n");
                System.out.println(" Enter your first number :");
                number1 = numberInput.nextInt();
                System.out.println("\nEnter your Second Number :");
                number2 = numberInput.nextInt();
                int difference = number1 - number2;
                System.out.println("\n The difference of the two numbers is : "+difference);
                break;

            case 3 :
                System.out.println("You have chosen multiplication \n");
                System.out.println(" Enter your first number :");
                number1 = numberInput.nextInt();
                System.out.println("\nEnter your Second Number :");
                number2 = numberInput.nextInt();
                int multiplication = number1 * number2;
                System.out.println("\n The multiplication of the two numbers is : "+multiplication);
                break;

            default :
                System.out.println("Invalid Choice! ");

        }

    }

}
