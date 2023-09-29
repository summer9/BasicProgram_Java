
public class advanced {

	
	
	public static void main(String[] args) {
	//sumValues(2,5);
		//formatSentence("Justin", 180);
	
		//printTitle(true);
		calculate(9,3,"mul");
	}

	
	//public static int sumValues(int num1, int num2) {
		
//		int sum = num1+num2;
//		
//		System.out.println(sum);
//		return sum;
	
	//public static void formatSentence(String name, int height) {
		//System.out.println(name +" "+ "is " + height + "cm" + " " + "tall.");
//	public static void printTitle(boolean title)
//	{	
//		if (title = true)
//			{
//			System.out.println("The Title");
//			System.out.println("*********");
//			}
//			else
//			{
//				System.out.println("nothing");
//			}	
//	}	
//}
	public static void calculate(int num1, int num2, String calculation) {
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;	
		
		if ( calculation.equals("sum"))
		{
		System.out.println("The result is " + " " + sum);
		}
		else if (calculation.equals("sub"))
		{
			System.out.println("The result is" + " " + sub);
		}
		else
		{
			System.out.println("The result is" + " "+ mul);
		}
	}
}
	
