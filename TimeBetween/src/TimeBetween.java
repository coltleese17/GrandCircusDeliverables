import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeBetween {
	
	public static void main(String[] args) {
		
		//initializes variables
		LocalDate firstFormattedDate = null;
		LocalDate secondFormattedDate = null;
		String firstInputtedDate;
		String secondInputtedDate;
		Scanner sc = new Scanner(System.in);
		
		//creates the format for the date
		DateTimeFormatter dateFormat = DateTimeFormatter
				.ofPattern("uuuu-MM-dd") // sets the format
				.withResolverStyle(ResolverStyle.STRICT); //this line is because the default ResolverStyle thinks February has 30 days
		
		//prompt the user for the first date
		System.out.println("Please enter a date in YYYY-MM-DD format:");
		
		//validates the format of the first given date
		//and parses it into a LocalDate object with the correct format
		while (true) {
			try {
				firstInputtedDate = sc.nextLine();
				firstFormattedDate = LocalDate.parse(firstInputtedDate, dateFormat);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Invalid date, please make sure it is a valid date in YYYY-MM-DD format");
			}
		}
		
		//prompts the user for the 2nd date
		System.out.println("Please enter the next date in YYYY-MM-DD format:");
		
		// validates the format of the second given date
		// and parses it into a LocalDate object with the correct format
		while (true) {
			try {
				secondInputtedDate = sc.nextLine();
				secondFormattedDate = LocalDate.parse(secondInputtedDate, dateFormat);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Invalid date, please make sure it is a valid date in YYYY-MM-DD format");
			}
		}
		
		//calculates the days between the two dates
		Period daysBetween = Period.between(firstFormattedDate, secondFormattedDate);

		System.out.println("There are " + Math.abs(daysBetween.getYears()) + " years, " + Math.abs(daysBetween.getMonths()) +
                " months, and " + Math.abs(daysBetween.getDays()) + " days between your inputted dates");

	}
}