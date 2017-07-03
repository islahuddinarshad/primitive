import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/*
 * This program asks for the number of digits followed by the 
 * exact number to decode after running through random numbers
 */
public class Breaker {
	
	/**
	 * The main program runs the breaker function
	 * @param args The arguments to process
	 */
	public static void main(String [] args) {
		
		runBreaker();
	}
	
	/**
	 * The function asks for a digit (1-9) to decode.
	 * It then asks for the exact number to decode. Once entered,
	 * it displays all the combinations gone through to "crack" the
	 * integer code and lists the number of combinations
	 */
	public static void runBreaker() {
		
		Random rand = new Random();
		
		String flow = "";

        System.out.print("Please enter the number of digits you want to decode (up to nine digits): ");
			
        Scanner input = new Scanner(System.in);
			
        int number = input.nextInt();
			
        System.out.print( "Please enter a number to decode: " );
			
        Scanner guess = new Scanner( System.in );
			
        String guessNumber = guess.next();

			
			for ( int i = 0; i < Integer.MAX_VALUE; i++ ) {
				
				int number1 = rand.nextInt(10);
				int number2 = rand.nextInt(10);
				int number3 = rand.nextInt(10);
				int number4 = rand.nextInt(10);
				int number5 = rand.nextInt(10);
				int number6 = rand.nextInt(10);
				int number7 = rand.nextInt(10);
				int number8 = rand.nextInt(10);
				int number9 = rand.nextInt(10);
				
			    if ( number == 1 ) {
				    flow = "" + number1;
			    }
			    else if ( number == 2 ) {
				    flow = "" + number1 + number2;
			    }
			    else if ( number == 3 ) {
				    flow = "" + number1 + number2 + number3;
			    }
			    else if ( number == 4 ) {
				    flow = "" + number1 + number2 + number3 + number4;
			    }
			    else if ( number == 5 ) {
			    	flow = "" + number1 + number2 + number3 + number4 + number5;
			    }
			    else if ( number == 6 ) {
				    flow = "" + number1 + number2 + number3 + number4 + number5 + number6;
			    }
			    else if ( number == 7 ) {
				    flow = "" + number1 + number2 + number3 + number4 + number5 + number6 + number7;
			    }
			    else if ( number == 8 ) {
			    	flow = "" + number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8;
			    }
			    else if ( number == 9 ) {
				    flow = "" + number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9;
			    }
			    else {
			    	System.out.println( " You did not enter a valid number.");
			    }
			
			System.out.println( flow );
			
			if ( guessNumber.equals( flow ) ) {
				
				System.out.println("===============================================================");
				
				System.out.println( "You code is cracked-----> it is: " + guessNumber + " after " + i + " combinations" );
	
				break;
			}
		
		}
			
	}
		
}
