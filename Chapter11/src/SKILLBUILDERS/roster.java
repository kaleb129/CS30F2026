package SKILLBUILDERS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class roster 
{
	public static void main(String[] args) 
	{
		File stuNameFile;
		String fileName, firstName, lastName;
		int numStudents;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the file directory: ");
		fileName = input.nextLine();
		stuNameFile = new File(fileName);
		
		System.out.print("How many students: ");
		numStudents = input.nextInt();
		
		
		try
		{
			FileOutputStream out = new FileOutputStream(stuNameFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for(int i = 0; i < numStudents; i++)
			{
				System.out.print("Enter student first name: ");
				firstName = input.next();
				System.out.print("Enter student last name: ");
				lastName = input.next();
				writeStu.writeObject(new StuName(firstName, lastName));
			}
			writeStu.close();
			System.out.println("Data has been written to the file");
			
		
			FileInputStream in = new FileInputStream(stuNameFile);
			ObjectInputStream readStuName = new ObjectInputStream(in);
			
			for(int j = 0; j < numStudents; j++)
			{
				System.out.println((StuName)readStuName.readObject());
			}
			readStuName.close();
			
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) 
		{
			System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) 
		{
			System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
    	}
		
		
		
		

	}

}

