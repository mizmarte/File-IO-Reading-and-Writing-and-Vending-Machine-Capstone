package com.techelevator;

import java.io.File;
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
		
		String fileName = "files/alices_adventures_in_wonderland.txt";
		System.out.println("Please enter the source file:");
		fileName = userInput.nextLine();
		System.out.println();
		
		String search = "";
		System.out.println("Please enter the search word:");
		search = userInput.nextLine();
		System.out.println();
		
		String replacement = "";
		System.out.println("Please enter the word to replace the search word with:");
		replacement = userInput.nextLine();
		System.out.println();
		
		File wordFile = new File(fileName);
		
		
    	File outFile = new File(replacement);
    	
    	try(
    			Scanner inStream = new Scanner(wordFile);
    			PrintWriter outStream = new PrintWriter(outFile);
    		)
    	{


    		while(inStream.hasNextLine())
    		{
    			String searchLine = inStream.nextLine();
    			
    			String[] words = searchLine.split(" ");
    			
    			for(String keyWord:words)
    			{
    				if(searchLine.contains(search))
    				{
    					searchLine.replace(search, replacement);
    					
    				}
    				
    			}
    		}
    			
    	
  		
    	}
    	catch (Exception e)
    	{
  		
    	}
    }
	
}
