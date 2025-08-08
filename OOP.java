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

        public static void selectionEasy() {
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
    
                System.out.print("Enter number (or type 'exit'): ");
                String input = scanner.next();
    
                if (input.equalsIgnoreCase("exit")){
                    System.out.println("Program Exiting Thank You");
                    break;
                }
    
                int num;
                try { 
                    num = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Please Input Valid Number or 'exit'");
                    System.out.println();
                    continue;
                }
    
                if (num > 0){
                    System.out.println("Your number is Positive" );
                } else if (num == 0){
                    System.out.println("Your number is Zero");
                } else{
                    System.out.println("Your number is Negative");
                } 
    
                System.out.println();
    
            }
    
            scanner.close();
    
        }
    

         public static void selectionMedium() {
            Scanner scanner = new Scanner(System.in);
    
        while (true){
    
            System.out.print("Enter fIrst numbers (or type 'exit'): ");
            String input = scanner.next();
    
            if (input.equalsIgnoreCase("exit")){
                System.out.println("Program Exiting Thank You");
                break;
            }
    
            int num1;
            try { 
                num1 = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Please Input Valid Number or 'exit'");
                continue;
            }
    
            System.out.print("Enter second number: ");
            int num2;
            try { 
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Please Input Valid Number");
                scanner.next();
                continue;
            }
    
            System.out.print("Enter third number: ");
            int num3;
            try { 
                num3 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Please Input Valid Number");
                scanner.next();
                continue;
            }
        
            System.out.println();
    
    
            if ( num1 > num2 && num1 > num3 ){
                System.out.println(num1 + " is largest among " + num2 + " and " + num3);
            } else if (num2 > num1 && num2 > num3 ){
                 System.out.println(num2 + " is largest among " + num1 + " and " + num3);
            } else {
                 System.out.println(num3 + " is largest among " + num1 + " and " + num2);
            }
            System.out.println();
    
    
            if ( num1 < num2 && num1 < num3 ){
                System.out.println(num1 + " is smallest among " + num2 + " and " + num3);
            } else if (num2 < num1 && num2 < num3 ){
                 System.out.println(num2 + " is smallest among " + num1 + " and " + num3);
            } else {
                 System.out.println(num3 + " is smallest among " + num1 + " and " + num2);
            }
    
            System.out.println();
        }
    
            scanner.close();
    
        }
    

        public static void selectionHard() {
            Scanner scanner = new Scanner(System.in);
    
            while (true) { 
                System.out.println("Enter grade score (or enter 'exit'): ");
                String input = scanner.next();
    
                //System exit when input "exit"
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program...");
                    break;
                }
    
                int score;
                try {
                    score = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }
    
                if (score >= 90 && score <= 100) {
                    System.out.println("Your grade is A " );
                } else if (score >= 80 && score <= 89) {
                    System.out.println("Your grade is B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("Your grade is C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("Your grade is D");
                } else if (score >= 0 && score <= 59) {
                    System.out.println("Your grade is F");
                } else {
                    System.out.println("Score out of range. Must be between 0 and 100.");
                }
                
                System.out.println(" ");
                
            }
            scanner.close();
    
        }
    

        public static void repetitionEasy() {
    
            System.out.println("Printing first 10 natural numbers...");
    
                for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
    
        }
    

        public static void repetitionMedium() {
            Scanner scanner = new Scanner(System.in);
    
            while (true){
    
                System.out.println("Enter Number (or 'exit'): ");
                String input = scanner.next(); // The number to calculate factorial
    
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program...");
                    break;
                }
    
                int number;
                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }
    
                long factorial = 1; // Use long to handle larger factorials
                System.out.println(""); // for spacing
    
                for (int i = 1; i <= number; i++) {
                    factorial *= i; // factorial = factorial * i;
                }
    
                System.out.println("Factorial of " + number + " is: " + factorial);
                System.out.println(" ");
    
            }
            scanner.close();
    
        }


        public static void repetitionHard() {
            Scanner scanner = new Scanner(System.in);
    
            while (true){
                System.out.println("Enter Number (or 'exit'): ");
                String input = scanner.next(); // The number to calculate factorial
    
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program...");
                    break;
                }
    
                int num;
                try {
                    num = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                    continue;
                }
    
                boolean isPrime = true;
    
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0 ) {
                            isPrime = false;
                            break;
                        }
                    }
                }
    
                System.out.println(" ");
    
                //for output display
                if (isPrime) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is Not a prime number");
                    System.out.print("Divisor: ");
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0) { 
                        System.out.print( i + " ");
    
                        System.out.println(" "); // for spacing
                        }
                    }
                }
    
                System.out.println(" ");
    
            }
            scanner.close();
    
        }

    



  
}
