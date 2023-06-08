package FileHandling;

import java.io.File;
//import java.util.logging.Formatter;
import java.util.Formatter;
import java.util.Scanner;

public class fDemo1 {

	public static void main(String[] args) {
		//File myfile = new File("student.txt");
		int id;
		String name;
		Scanner scan = new Scanner(System.in);
		//try
		//{
		//	myfile.createNewFile();
		//	System.out.println("File Create done");
		//}
		//catch(Exception e)
		//{
		//	System.out.println("Error occred when create a file");
		//}
		//System.out.println(myfile.getName());
		/*
		try
		{
			Formatter formatter = new Formatter("student.txt");
			
			System.out.print("Enter Your input: ");
			
			for(int i=0;i<3;i++)
			{
				System.out.print("Enter Student1 Nmae and ID : ");
				id=scan.nextInt();
				name=scan.nextLine();
				formatter.format("%d %s\r\n",id,name);
			}
			System.out.println("Write complete");
			formatter.close();
		}
		catch(Exception e)
		{
			System.out.println("Haha");
		}
		*/
		
		File file = new File("student.txt");
		int maxId=0;
		try
		{
			Scanner input = new Scanner(file);
			
			while(input.hasNext())
			{
				id = input.nextInt();
				name = input.nextLine();
				System.out.println("Id: "+id+" Name: "+name);
				if(id>maxId)
				{
					maxId = id;
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("haha worng code");
		}
		
		System.out.println("Max id: "+maxId);
	}

}
