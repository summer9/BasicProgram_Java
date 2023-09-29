	import java.util.Scanner;

public class peerReview3 {

//This code is a simple login program that prompts the user for their first name,last Name and business domain Name


		public static void main(String[] args) {

		Scanner in = new Scanner (System.in);

		String firstName;

		String lastName;

		String businessDormainName;

		//Prompt for and read the first Name

		print("first name ?");

		firstName = in.nextLine();

		// Prompt for and read the last Name

		print("Last Name ?");

		lastName = in.nextLine();

		//Prompt for and read the Business domain Name

		print("Business Dormain Name ?");

		businessDormainName = in.nextLine();

		// scanner was close here

		in.close ();

		//check if the user import their firstName,lastName or business domain Name

		if (firstName.isEmpty() || lastName.isEmpty () || businessDormainName.isEmpty() )

		{

		print(" Error! FirstName and /or LastName or businessDormainName is Missing ");

		System.exit(0);


		}

		else

		{

		generateEmail(firstName, lastName, businessDormainName);

		generateUsername(firstName, lastName);

		}

		}

		// generate email method is define here

		private static void generateEmail(String firstName, String lastName, String businessDormainName) {

		String Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + businessDormainName;

		print("Generate Email : " + Email);

		}

		// the generate userName method is define here

		private static void generateUsername(String firstName, String lastName) {

		String userName = firstName.substring(0, Math.min(firstName.length(), 4)).toLowerCase() +

		lastName.substring(0, Math.min(lastName.length(), 4)).toLowerCase();

		print( " Username : " + userName);

		}



		// the print method is define here

		//public static void print(String message){

		//System.out.println(message);

		}


	}


