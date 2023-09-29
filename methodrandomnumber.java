import java.util.Random;

public class methodrandomnumber {
	public static void main(String[]args) {

	System.out.println(createRandomnumber());
	}
	public static int createRandomnumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(7);
		return randomNumber;
	}

}
