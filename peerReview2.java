import java.util.Scanner;
public class peerReview2 {

	public static void main(String[] args) {
		

		Scanner myScanner = new Scanner(System.in);

		System.out.println("First name?"); //input first name

		String firstName = myScanner.nextLine();

		System.out.println("Last name?"); // input last name

		String lastName = myScanner.nextLine();

		System.out.println("Business domain name?"); // input domain name

		String domainName = myScanner.nextLine();

		if (firstName.isEmpty() || lastName.isEmpty()) { //selection

		System.out.println("Error! First and/or last name is missing.");

		}

		String email = GenerateEmail(firstName, lastName,domainName);

		String username = GenerateUsername(firstName, lastName);

		System.out.println("Generated Email: " + email);

		System.out.println("Generated Username: " + username);



		}

		//Method GenerateEmail(fn+ln+dn)

		// to lowercase

		public static String GenerateEmail(String firstName, String lastName, String domainName) {

		String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domainName;

		return email;

		}



		// Method to generate a GenerateUsername(fn+ln)

		// first4 last4

		public static String GenerateUsername(String firstName, String lastName) {

		String username = firstName.substring(0, Math.min(firstName.length(), 4)).toLowerCase() +

		lastName.substring(Math.max(lastName.length() - 4, 0)).toLowerCase();

		return username;

		}


	}

