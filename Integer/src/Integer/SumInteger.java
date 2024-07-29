package Integer;
import java.util.Scanner;
public class SumInteger 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		boolean error=false;
		System.out.println("Enter integer:");
		while(scanner.hasNext()) 
		{
			if(scanner.hasNextInt()) 
			{
				sum+=scanner.nextInt();
			}else
			{
				System.out.println("Error:non integer value");
				error=true;
				break;
			}
		}
		if(!error) 
		{
			System.out.println("output:"+sum);
		}
		scanner.close();
	}
}