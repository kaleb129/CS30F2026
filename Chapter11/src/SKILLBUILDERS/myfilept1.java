package SKILLBUILDERS;

import java.io.File;
import java.util.Scanner;

public class myfilept1 {

	public static void main(String[] args) 
	{
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);

		// obtain file name from user
		System.out.println("Enter file name: ");
		fileName = input.next();
		
		// create file
		textFile = new File(fileName);
		
		//Determine if da file exist or nah
		if(textFile.exists())
		{
			System.out.println("file exists");
		} 
		else
		{
			System.out.println("file dont exist");
		}
	}

}
