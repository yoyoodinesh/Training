import java.util.Scanner;
public class arithmeticCalculator{

			public static void main(String[] args) {
			
				double num1, num2, answer = 0;
				
				char operator;
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter the first number: ");
				num1 = input.nextDouble();
				
				System.out.println("Enter the second number: ");
				num2 = input.nextDouble();
				
				System.out.println("Select an operator: +, -, *, /");
				operator = input.next().charAt(0);
				
				switch(operator)
		        {
		            case '+':
		            	answer = num1 + num2;
		                break;

		            case '-':
		            	answer = num1 - num2;
		                break;

		            case '*':
		            	answer = num1 * num2;
		                break;

		            case '/':
		            	answer = num1 / num2;
		                break;
		                
		            default:
		                System.out.println("Incorrect operator!");
		                break;
		        }
				
				System.out.println(num1 + " " + operator + " " + num2 + " : " + answer);
			}
		}
		 

	
