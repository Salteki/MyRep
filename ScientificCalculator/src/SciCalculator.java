import java.util.Scanner;

public class SciCalculator
{
    /* Creating an entry point
    for Java program
     */
    public static void main(String [] args)
    {
        Scanner myScanner = new Scanner(System.in); // Creating a scanner to read an input

        double first = 0; // first operand
        double second = 0; // second operation
        double result = 0.0; // result of operation
        double totOperations = 0; // sum of operations
        int numOperations = 0; //number of operations
        double totAverage; // total average of operations
        int selection = 1; // menu selection


        do {
            if(selection > 0 && selection <7) // if selected number is from 1 to 6
            {
                myMenu(result);  // calling for a method
            }

            System.out.print("\nEnter Menu Selection: ");
            selection = myScanner.nextInt(); // statement to read from a scanner

                if (selection > 0 && selection < 7)
                {
                    System.out.print("Enter first operand: ");
                    first = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    String string = myScanner.next();


                    if (string.equals("RESULT"))
                    {
                        second = result; // result value is assigned to the second operand
                    }
                    else {
                        second = Double.parseDouble(string); // returns a new double initialized to the value
                    }
                }

                switch (selection)
                {
                    case 0:
                        System.out.println("\nThanks for using this calculator. Goodbye!");
                        System.exit(0);
                        break;
                    case 1:
                        result = first + second;
                        // updating sum
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 2:
                        result = first - second;
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 3:
                        result = first * second;
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 4:
                        result = first / second;
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 5:
                        result = Math.pow(first, second);
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 6:
                        result = (Math.log(second) / Math.log(first));
                        totOperations = totOperations + result;
                        numOperations++;
                        break;
                    case 7:
                        // when the count == 0,
                        totAverage = totOperations / numOperations;
                        totAverage = Math.round(totAverage * 100.0) / 100.0; // rounding total average number
                        if (totAverage == 0) {
                            System.out.println("\nError: No calculations yet to average!");
                        }
                        else
                        {
                            System.out.println("\nSum of calculations: " + totOperations);
                            System.out.println("Number of calculations: " + numOperations);
                            System.out.println("Average of calculations: " + totAverage);
                        }
                        break;
                    default:
                        System.out.println("\nError: Invalid selection!");
                }

        }
        while (true);
    }

    // creating method for calculator menu
    public static void myMenu(double result)
    {
        System.out.println("\nCurrent Result: " + result);
        System.out.println("\nCalculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
    }
}



