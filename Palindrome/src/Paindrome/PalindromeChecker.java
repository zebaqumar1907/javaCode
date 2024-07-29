package Paindrome;
public class PalindromeChecker {
public static void main(String[] args) {
        checkNumber("2468642");
        checkNumber("12345");
        checkNumber("12345654321");
    }
    public static void checkNumber(String number){
        if (isPalindrome(number)) {
            int evenSum =sumEvenDigits(number);
            if (evenSum > 25){
                System.out.println(number +"is palindrome and the sum of even numbers is greater than 25");
            }else{
                System.out.println(number+" is palindrome and the sum of even number is less than 25");
            } 
        } else {
            System.out.println(number+" is not palindrome");}
    }
    public static boolean isPalindrome(String number){
        int length = number.length();
        for(int i=0;i<length/2;i++){
            if(number.charAt(i) != number.charAt(length-i-1)){
                return false;
            }
        }return true;
    }
    public static int sumEvenDigits(String number){
        int sum=0;
        for(char c:number.toCharArray()) {
            int digit=Character.getNumericValue(c);
            if(digit %2==0){
                sum+=digit;}
        }return sum;
	}
}
