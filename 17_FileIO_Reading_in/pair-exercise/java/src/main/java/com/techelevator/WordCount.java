package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void readAliceAdventuresInWonderland() 
	{

		String filePath = "alices_adventures_in_wonderland.txt";
		File alicesFile = new File(filePath);
		
		Scanner scanner;
		try
		{
			scanner = new Scanner(alicesFile.getAbsoluteFile());
			int counter = 0;
			while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
			{
				
				
				String line = scanner.nextLine();
				String[] parts = line.split(" ");
				for (String words: parts)
				{
					counter++;
				}
				
				System.out.println(counter);
			}
				
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("File: " + filePath + " was not found.");
		}
		
	}

}
