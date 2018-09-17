package introToStrings;
import java.util.Scanner;
public class IntroToStrings 
{

	
	public static void main(String[] args) 
	{
		challengeOne();
		challengeTwo();
		challengeThree();
	}

	public static void challengeOne()
	{
		Scanner shoutingWords = new Scanner(System.in);
		System.out.println("Please shout something IN ALL CAPS");
		String shouting = (shoutingWords.nextLine());
		String upper = new String (shouting.substring(0,1));
		System.out.println(upper + shouting.substring(1).toLowerCase());
	}
	
	public static void challengeTwo(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter text below");
		String input = (userInput.nextLine());
		for (int i = 0; i < input.length(); i++)
		{
		System.out.println(input.substring(i, i+1));
		}
	}
		
	public static void challengeThree()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a sentence below");
		String sentence = userInput.nextLine();
		
		int counter = 0;
		for (int i = 0; i < sentence.length(); i++)
		{
			sentence.substring(i, i + 1);
			switch (sentence.substring(i, i+1))
			{
				case "a":
				case "A":
				case "e":
				case "E":
				case "i":
				case "I":
				case "o":
				case "O":
				case "u":
				case "U":	
			
					counter++;
			}
			
		}
				if (counter == 1)
				{
					System.out.println("Your sentence has "+ counter + " vowel.");
				}
				else {
					System.out.println("Your sentence has " + counter + " vowels.");
				}		
	}



}
	


	
