import java.util.Scanner;


public class NumberReverse {

	public static void main(String[] args) {
		
		//initialize int variables
		int userNum, revNum = 0;
		
		//prompt users to input an int
		System.out.println("Enter an integer you want reversed:");
		
		//initializes scanner object 
		Scanner sc = new Scanner(System.in);
		
		//validates that user input is an integer
		while (!sc.hasNextInt()) {
			System.out.println("That's not an integer! Please enter an integer: ");
			sc.next();
		}
		
		//assigns userNum to the int inputed by the user
		userNum = sc.nextInt();
		
		
		while (userNum != 0) {
			//adds a placeholder space to the right of the existing revNum
			revNum = revNum * 10;
			
			//puts the last digit of the userNum in the placeholder space
			revNum = revNum + (userNum % 10);
			
			userNum = userNum / 10;
		}
		
		System.out.println(revNum);

	}

}
