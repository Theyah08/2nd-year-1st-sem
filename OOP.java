import java.util.Arrays;
import java.util.Scanner;

class OOP {
    public static void main(String[] args) {

       // Aliyah Othelia D. Piel
       // BSIT-2A
       // Lab Activity #1 - Programming Exercises (Review)
       // IT ELEC 1 - Object Oriented Programming


        // Programming Basic
        //basicasy();
        //basicMedium();
        //basicHard();

        // Selection
        // selectionEasy();
        // selectionMedium();
        // selectionHard();

        // Repetition
        // repetitionEasy();
        // repetitionMedium();
        // repetitionHard();


        // Methods
        // methodsEasy();
        // methodsMedium();
        // methodsHard();

        // Arrays
        // arraysEasy();
        // arraysMedium();
        //arraysHard();
      
    }

    public static void basicEasy() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
    
            scanner.close();
        
            
            double sum = num1+num2;
            double difference = num1-num2;
            double product = num1 * num2;
            double quotient = num1 / num2;
    
            System.out.println("sum is: " + sum); 
            System.out.println("difference is: " + difference);
            System.out.println("product is: " + product);
            System.out.println("quotient is: " + quotient);
    
    }

      public static void basicMedium() {
            Scanner scanner = new Scanner(System.in);
    
            while (true){ 
                System.out.println("Enter temperature value (or type 'exit'): ");
                String input = scanner.next();
    
                //System exit when input "exit"
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program...");
                    break;
                }
    
                // check if input was a only number and throw back its not
                double temp;
                try {
                    temp = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }
    
                System.out.println("Enter temperature scale (C, F, K): ");
                //check if the character input match in capital on not
                char scale = scanner.next().toUpperCase().charAt(0);
    
                if (scale == 'C') {
                    System.out.println("F: " + (temp * 9/5 + 32));
                    System.out.println("K: " + (temp + 273.15));
                } else if (scale == 'F') {
                    double c = (temp - 32) * 5/9;
                    System.out.println("C: " + c);
                    System.out.println("K: " + (c + 273.15));
                } else if (scale == 'K') {
                    double c = temp - 273.15;
                    System.out.println("C: " + c);
                    System.out.println("F: " + (c * 9/5 + 32));
                } else {
                    System.out.println("Invalid");
                }
                //spacing for the last text avoid sticking
                System.out.println();
            }
    
            scanner.close();
        }

      public static void basicHard() {
            Scanner input = new Scanner(System.in);
    
            double num1, num2, result;
            char operator;
            String continueCalc;
    
            do {
                // Get the first number from the user
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();
    
                // Get the operator from the user
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = input.next().charAt(0);
    
                // Get the second number from the user
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
    
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
    
                    case '-':
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
    
                    case '*':
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
    
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        }
                        break;
    
                    default:
                        System.out.println("Error: Invalid operator.");
                        break;
                }
                // Ask the user if they want to continue
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                continueCalc = input.next();
    
            } while (continueCalc.equalsIgnoreCase("yes"));
    
            System.out.println("Calculator exited.");
            input.close();
        }



  
}
