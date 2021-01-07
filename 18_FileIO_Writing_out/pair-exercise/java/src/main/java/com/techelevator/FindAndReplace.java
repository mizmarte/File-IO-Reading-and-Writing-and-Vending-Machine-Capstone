package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the source file:");
		String fileName = userInput.nextLine();
		System.out.println();
		
		File wordFile = new File(fileName);
		
		System.out.println(wordFile);
		System.out.println();
		
		File outFile = new File("replacement.txt");
		Scanner scanner;
		if(wordFile.isFile())
		{
			wordFile.toString();
		}
		
//		
//		
//		
		
		
		
		
    	
    	
    	try(
    			Scanner inStream = new Scanner(wordFile.getAbsoluteFile());
    			FileOutputStream outStream = new FileOutputStream(outFile);
    			PrintStream fileWriter = new PrintStream(outStream);
    		)
    	{
    		String search = "";
    		System.out.print("Please enter the search word:");
    		search = userInput.nextLine();
    		System.out.println();
    		
    		String replacement = "";
    		System.out.print("Please enter the word to replace the search word with:");
    		replacement = userInput.nextLine();
    		System.out.println();
    		
    		fileWriter.println(replacement);
    		
    		while(inStream.hasNextLine())
   		{
    			String searchLine = inStream.nextLine();
  			
    			fileWriter.println(searchLine.replaceAll(search, replacement));
    			
    			
    	}
    	inStream.close();		
    	
  		
    	}
    	catch (Exception e)
    	{
  		
    	}
    }
	
}
