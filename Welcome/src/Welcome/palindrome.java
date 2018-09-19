package Welcome;

import java.util.Scanner;

public class palindrome {

	
	private static String  getInput()
	{
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		//String input=sc.nextLine();
		StringBuffer input_buffer = new StringBuffer(sc.nextLine());
		//input_buffer.append(sc.nextLine());
		
		System.out.println("The text entered is: "+input_buffer);
		System.out.println("Are you sure this is the input - yes /no ?");
		StringBuffer verify=new StringBuffer(sc.nextLine());
		
		if (verify.toString().equalsIgnoreCase("no"))
		{
			return getInput();
		}
		if (verify.toString().equalsIgnoreCase("yes"))
		{
			return input_buffer.toString();
		}	
		
		return "Error";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = getInput();
		System.out.println("Final Input:"+ input);
		

	}

}
