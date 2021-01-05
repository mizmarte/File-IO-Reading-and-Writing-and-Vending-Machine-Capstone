package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) 
	{
		File alicesFile = new File ("alices_adventures_in_wonderland.txt");
		if(alicesFile.exists())
		{
			readFile(alicesFile);
		}
		else
		{
			System.out.println("The file does not exist.");
		}
		
	}
	public static void readFile(File alicesFile)
	{
		try
		{
			Scanner scanner = new Scanner(alicesFile);
//			System.out.println("Reading file: " + alicesFile);
//			System.out.println("File Path: " + alicesFile.getAbsolutePath());
		
			
			String line = "";
			int counter = 0;
			while(scanner.hasNext()) // when should we stop looping? when there are no more lines
			{
				line = scanner.next();
				counter++;	
			}
			System.out.println("Word Count: " + counter);
			
				int wordCount = 0;
				int sentenceCounter = 0;
				while(scanner.hasNext())
				{
					 line = scanner.next();
					 wordCount++;
					
					if(line.endsWith(".") || line.endsWith("!") || line.endsWith("?"))
					{
						sentenceCounter++;
					}
				}
			System.out.println("Sentence Count: " + sentenceCounter);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			
		}
		
	}

}
