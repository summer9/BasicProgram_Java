
public class advanceArrays {

	public static void main(String[] args) {
	
	System.out.println(aphorismPrinter());
		
	}
		public static String aphorismPrinter() {
			
			String[] aphorismPrinter = {
						"Actions speak louder than words.",
						"A barking dog never bites.",
						"A penny saved is a penny earned.",
						"All things come to those who wait."
						};		
								
				if(typeAnswer >= 0 && typeAnswer<aphorismPrinter.length)	
				{
					return aphorismPrinter[typeAnswer];
				}			
		            
				else 
				{
		         System.out.println("Invalid input. Please enter a number between 0 and " + (aphorismPrinter.length - 1));
		         return ""; // Return an empty string as a default value.
				}
}
}