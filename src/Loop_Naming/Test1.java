package Loop_Naming;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your input: ");
		n=scan.nextInt();
		masterLoop:
		for(int i=1;i<n;i++)
		{
			semimaster:
			for(int j=1;j<n;j++)
			{
				
				if(i==2 && j==2)
				{
					break semimaster;
					//break masterLoop;
				}
			
					System.out.println(i+" "+j);
				
			}
			//System.out.println();
		}
	}

}
