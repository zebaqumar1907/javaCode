package UniqueInteger;
import java.util.Scanner;
public class UniqueNumberCheck {
	public static boolean isUniqueNumber(int number) {
		boolean[] digits=new boolean[10];
		int currentDigit;
		while(number>0) {
			currentDigit=number%10;
					if(digits[currentDigit]) {
						return false;
					}
			digits[currentDigit]=true;
			number/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int number= scanner.nextInt();
		if(isUniqueNumber(number)) {
			System.out.println(number + " is a unique number");
		}
		else {
			System.out.println(number + " is not a unique integer");
		}
		scanner.close();
	}

}
