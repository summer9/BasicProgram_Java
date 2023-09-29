
public class calculate3parameter {

	public static void main(String[] args) {
	
		calculate(2,3,"multiplication");
	}
	
	public static void calculate(int numb1, int numb2, String cal) {
		int result;
	
		if (cal.equals("multiplication"))
		{
			result = numb1*numb2;
			System.out.println("The result of multiplication is: " + result);
		}
		else if (cal.equals("add"))
		{
			result = numb1 + numb2;
			System.out.println("The result of addition is: " + result);
		}
		else if (cal.equals("subtract"))
		{
			 result = numb1 - numb2;
			 System.out.println("The result of subtraction is: " + result);
		}
	
}
}

