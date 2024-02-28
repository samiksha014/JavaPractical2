import java.util.Scanner;

 class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = 12;
        double b = 6;
        
        
            System.out.println("\nOperations: +, -, *, /, %, s (square), c (factorial), l (power)");

        while (true) {
     
            System.out.print("Enter operation: ");
            char operation = scanner.next().charAt(0);
            double result = 0;

            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error!!! - Division by zero");
                        continue;
                    }
                    break;
                case '%':
                    result = a % b;
                    break;
                case 's':
                    result = a * a;
                    break;
                case 'c':
                    int fact=1;
                    for(int i=1;i<=a;i++){
                    fact*=i;
                    }
                    result=fact;
                    break;
                case 'l':
                    result=1;
                    for(int i=0;i<b;i++){
                    result*=a;
                    }
                    break;
                case 'z':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
    }



       


		
		
