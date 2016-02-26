/**
 * Removes one character from a word
 * @Author Sukhjinder Nahal
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RemovingCharacters {

	public static void main(String[] args) {

		System.out.println("Enter word or Z to exit");
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		
		while(!word.equals("Z"))
		{
			char[] wordArray = word.toCharArray();
			ArrayList<Character> wordArrayList = new ArrayList<Character>();
			for(int i = 0; i<wordArray.length;i++){
				wordArrayList.add(wordArray[i]);
			}
			
			System.out.println("Enter Character you would like to remove");
			String charToRemove = keyboard.next();
			char x = charToRemove.charAt(0);
			
			for(int i=0;i<wordArrayList.size();i++)
			{
				if(x ==(wordArrayList.get(i)))
				{
					wordArrayList.remove(i);
					String b = wordArrayList.toString().replace("[", "").replace("]" ,"").replace(",", "").replace(" ", "").trim();
					System.out.println("Result: " + b);
				}
			}
			
			System.out.println("Enter word or Z to exit");
			word = keyboard.next();
		}
		
		keyboard.close();
	}
}
