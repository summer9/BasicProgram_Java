
public class arraysbasicCau2 {
	

	    public static void main(String[] args) {
	        System.out.println(aphorismPrinter(1)); // Pass the desired index as an argument
	    }

	    public static String aphorismPrinter(int index) {
	        String[] aphorismPrinter = {
	            "Actions speak louder than words.",
	            "A barking dog never bites.",
	            "A penny saved is a penny earned.",
	            "All things come to those who wait."
	        };
// use condition if else
	        if (index >= 0 && index < aphorismPrinter.length) {
	            return aphorismPrinter[index];
	        } else {
	            return "Invalid index. Please provide a value between 0 and " + (aphorismPrinter.length - 1);
	        }
	    }
	// what if do not use return
}
