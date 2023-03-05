package InputFrmUsr;

import java.util.Scanner;


public class ArrayInput {
	public static char NextIndx(char ch)
	{
				return 0;
	}
	public static void main(String[] args) {
		int [] nums= new int[5];
		Scanner scan = new Scanner(System.in);
		/*
		 for(int i=0;i<5;i++)
			nums[i]=scan.nextInt();
		
		for(int x:nums)
			System.out.println(x);
		 */
		
		String ss;
		System.out.println("Enter a string: ");
		ss=scan.nextLine();
		for(int i=0;i<ss.length();i++)
		{
			System.out.println(ss.charAt(i));
		}
		
		System.out.println(NextIndx(ss.charAt(0)));
		
	}

}
