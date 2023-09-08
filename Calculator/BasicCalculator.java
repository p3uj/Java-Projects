import java.util.Scanner;   // Used to work the scanner (for storing the data that user's inputted).
public class BasicCalculator {
    private static Scanner scan = new Scanner(System.in);   // To store the data of the user's inputted. It is declare as private static to access this in any method.
    private static double num1, num2;

    // inputNum method
    public static double[] inputN(){
        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();
        
        double[] inputNum = {num1, num2};   // Store the num1 and num2 in the inputNum array.
        return inputNum;    // Return the value stored in the inputNum variable.
    }

    public static void main(String[] args){
        int choice;
        char con = 'Y';

        while (con == 'Y' || con == 'y'){
            System.out.println("────────────────────────────────────────────────");
            System.out.println("\t\tBASIC CALCULATOR");
            System.out.println("────────────────────────────────────────────────");
            System.out.println("[1] Addition");
            System.out.println("[2] Multiplication");
            System.out.println("[3] Subtraction");
            System.out.println("[4] Division");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();    // Store the date that the user inputted in the variable choice.
            
            while (choice < 1 || choice > 4){   // Execute this statement if the value of choice is not between 1 to 4.
                System.out.print("\nWARNING: INVALID CHOICE!\nEnter choice: ");
                choice = scan.nextInt();
            }

            System.out.println("────────────────────────────────────────────────");
            switch (choice){
                case 1 : System.out.println("\t\tADDITION"); break;
                case 2 : System.out.println("\t\tMULTIPLICATION"); break;
                case 3 : System.out.println("\t\tSUBTRACTION"); break;
                case 4 : System.out.println("\t\tDIVISION"); break;
            }
            System.out.println("────────────────────────────────────────────────");

            double[] inputNumbers = inputN(); // Call to inputNum method. And store the return value to an inputNumbers variable.
            num1 = inputNumbers[0]; // Assign the value of the inputNumbers in the index 0 to num1 variable.
            num2 = inputNumbers[1]; // Assign the value of the inputNumbers in the index 1 to num2 variable.
            switch (choice){
                case 1 : System.out.printf("\n%.2f + %.2f = %.2f\n\n", num1, num2, num1 + num2); break;
                case 2 : System.out.printf("\n%.2f x %.2f = %.2f\n\n", num1, num2, num1 * num2); break;
                case 3 : System.out.printf("\n%.2f - %.2f = %.2f\n\n", num1, num2, num1 - num2); break;
                case 4 : System.out.printf("\n%.2f ÷ %.2f = %.2f\n\n", num1, num2, num1 / num2); break;
            }
            
            System.out.print("Do you want to continue this program? (Y/N): ");
            con = scan.next().charAt(0);
            while (con != 'Y' && con != 'y' && con != 'N' && con != 'n'){
                System.out.print("WARNING: INVALID CHOICE!\nDo you want to continue this program?(Y/N): ");
                con = scan.next().charAt(0);
            }
        }
        scan.close();
        System.out.println("────────────────────────────────────────────────");
        System.out.println("\tTHANK YOU FOR USING MY PROGRAM!");
        System.out.print("────────────────────────────────────────────────");
    }
}