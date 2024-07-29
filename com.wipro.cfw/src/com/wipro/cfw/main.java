package com.wipro.cfw;
import java.util.Scanner;
public class main
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2!=0 && number>=20 && number<=30)
        {
            System.out.println("Tom");
            }
        else if (number % 2 ==0 && number >=20 && number<=30)
        {
            System.out.println("Jerry");
            }
        else{
            System.out.println("Number does not meet any conditions");
        }
        scanner.close();
    }
}