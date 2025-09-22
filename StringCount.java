package raju;

public class StringCount {

	public static void main(String[] args) {
		
		  String text = "To be or not to be, that is the question;"
		            + "Whether `tis nobler in the mind to suffer"
		            + " the slings and arrows of outrageous fortune,"
		            + " or to take arms against a sea of troubles,"
		            + " and by opposing end them?";

		        int spaces = 0, vowels = 0, letters = 0;

		        // Loop through characters
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);

		            // Count spaces
		            if (Character.isWhitespace(ch)) {
		                spaces++;
		            }

		            // Count letters
		            if (Character.isLetter(ch)) {
		                letters++;

		                // Check if vowel (case insensitive)
		                char lower = Character.toLowerCase(ch);
		                if (lower == 'a' || lower == 'e' || lower == 'i' || 
		                    lower == 'o' || lower == 'u') {
		                    vowels++;
		                }
		            }
		        }

		        System.out.println("The text contained:");
		        System.out.println("Vowels: " + vowels);
		        System.out.println("Consonants: " + (letters - vowels));
		        System.out.println("Spaces: " + spaces);

	}

}
