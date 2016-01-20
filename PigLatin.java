package textTransformatons;

import java.util.Scanner;

//Look at the rules on Wikipedia to make this full featured
public class PigLatin {
	
	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter the word or phrase you would like to chnage to Pig Latin: ");
		String input = user.nextLine();
		
		System.out.println(pigConverter(input));
	}
	
	public static String pigConverter(String nString){
		String[] stringWords = nString.split(" ");
		for(int i = 0; i < stringWords.length; i++){
			String temp = stringWords[i];
			String letterSwap = temp.substring(0, 1);
			if(temp.length() > 1){
				if(temp.charAt(temp.length() - 1) == '.' || temp.charAt(temp.length() -1) == ','){
					if(temp.charAt(temp.length() - 1) == '.'){
					stringWords[i] = temp.substring(1, temp.length() - 1) + "-" + letterSwap + "ay.";
					}
					else
						stringWords[i] = temp.substring(1, temp.length() - 1) + "-" + letterSwap + "ay,";
				}
				else
				stringWords[i] = temp.substring(1, temp.length()) + "-" + letterSwap + "ay";
			}
		}
		
		StringBuffer results = new StringBuffer();
		for(int j = 0; j < stringWords.length; j++){
			results.append(stringWords[j] + " ");
		}
		String returnString = results.toString();
		return returnString;
	}
}
