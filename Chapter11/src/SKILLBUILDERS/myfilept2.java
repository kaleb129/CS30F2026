package SKILLBUILDERS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myfilept2 
{

	public static void main(String[] args) 
	{ // cant use scanner to access files or the program is ai 
		File textFile;
		String response;
		Scanner input = new Scanner(System.in);
	
		// create file
		textFile = new File("C:\\Users\\49052003\\git\\CS30F2026\\Chapter11\\src\\cs311.txt");
	
		if(textFile.exists())
		{
			System.out.println("your file cs311 exists");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("cs311.txt has been created");
			}
			catch(IOException e)
			{
				System.out.println("File couldnt be created");
				System.err.println("IOException: "+e.getMessage());
			}
		}
		
		//delete file if user chooses
		System.out.println("(K)eep or (D)elete the file?");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
			{
				// delete the file
				if(textFile.delete());
				{
					System.out.println("ur file is deleted");
				}
			}
		else
		{
			System.out.println("we keep ur file");
		}
		
	}

}
