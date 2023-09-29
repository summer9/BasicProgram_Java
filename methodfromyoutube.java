import java.util.Scanner;
public class methodfromyoutube {
	
	
	public static void main(String[]args) {
	//	makeCoffee("big","strong");
	
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want a small or big cup?");
		String answerCupsize = in.nextLine();
		
		System.out.println("Do you want strong (1), medium (2) or mild (3) coffee?");
		String answerStrength = in.nextLine();
		int answerStrengthInt = Integer.parseInt(answerStrength); // convert String to int
		
		makeCoffee(answerCupsize, answerStrengthInt);
		
	}//end of the main

	public static void makeCoffee(String cupSize, int strength)
	{
		String strengthString;
		if (strength ==1)
		{
			strengthString = "strong";
		}
		else if (strength ==2)
		{
			strengthString = "medium";
		}
		else
		{
			strengthString = "mild";
		}
		
		System.out.println("Here you have a coffee that is: ");
		System.out.println("Cupsize: " + cupSize);
		System.out.println("Strength: " + strengthString);
		
		
		}
	}
	


