package calc;

import java.util.*;

public class Main {
  
  //initalizing the Scanner to read data from the user
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
    //We store the first value in result, and we will work with that. It will be updated as operations are done to it
		float result = 0, new_number;
		String op;
		System.out.print("Introduce the first number: ");
		new_number = input.nextFloat();
		result += new_number;
		while (true) {
			System.out.print("Introduce the operation: ");
			op = input.next();
      //Different cases for different operations, along with those being made once the next number is introduced as well
			switch (op) {
			case "CE": {
				result = 0;
				System.out.print("Introduce the new first number: ");
				result = input.nextFloat();
				break;
			}
			case "*": {
				System.out.print("Introduce the next number: ");
				new_number = input.nextFloat();
				System.out.print(result + " * " + new_number + " = ");
				result *= new_number;
				System.out.println(result);
				break;
			}
			case "/": {
				System.out.print("Introduce the next number: ");
				new_number = input.nextFloat();
				System.out.print(result + " / " + new_number + " = ");
				result /= new_number;
				System.out.println(result);
				break;
			}
			case "%": {
				System.out.print("Introduce the next number: ");
				new_number = input.nextFloat();
				System.out.print(result + " % " + new_number + " = ");
				result %= new_number;
				System.out.println(result);
				break;
			}
			case "+": {
				System.out.print("Introduce the next number: ");
				new_number = input.nextFloat();
				System.out.print(result + " + " + new_number + " = ");
				result += new_number;
				System.out.println(result);
				break;
			}
			case "-": {
				System.out.print("Introduce the next number: ");
				new_number = input.nextFloat();
				System.out.print(result + " - " + new_number + " = ");
				result -= new_number;
				System.out.println(result);
				break;
			}
      /*In case an operation isn't listed, or is invalid, the program will exit
      *(obviously for safety reasons, A.K.A. my laziness doesn't want me to develop the application any further!)
      */
			default: {
				System.out.print("Invalid operation! The program will now exit!");
				System.exit(0);
				break;
			}
			}
		}
	}
}
