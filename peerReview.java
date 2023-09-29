	import java.util.Scanner;
public class peerReview {

		//Method to generate email

		public static void GenerateEmail(String firstName, String lastName, String domain) {

		System.out.println(firstName + lastName +"@" +domain);

		}

		//Method to generate userName

		public static void GenerateUserName(String firstName, String lastName) {

		firstName = firstName.substring(0,4);

		lastName= lastName.substring(lastName.length()-4,lastName.length());

		System.out.println(firstName + lastName);

		}

		public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Ask the user to input their first name and last name

		System.out.println("First name?");

		String firstName = in.nextLine();

		firstName=firstName.toLowerCase();

		System.out.println("Last name?");

		String lastName = in.nextLine();

		lastName=lastName.toLowerCase();

		System.out.println("Business domain name?");

		String domain = in.nextLine();

		domain=domain.toLowerCase();

		// Check if first name or last name is empty

		if(firstName.isEmpty() || lastName.isEmpty()) {

		System.out.println("Error! First and/or last name is missing.");

		return;

		}

		// Here we call generateEmail and generateUserName methods;

		GenerateEmail(firstName, lastName, domain);

		GenerateUserName(firstName, lastName);

		}

		
	}


