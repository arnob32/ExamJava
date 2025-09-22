package raju;

public class Sort {

	public static void main(String[] args) {
		

		  String text = "To be or not to be, that is the question;"
		            + " Whether `tis nobler in the mind to suffer"
		            + " the slings and arrows of outrageous fortune,"
		            + " or to take arms against a sea of troubles,"
		            + " and by opposing end them?";

		        // Define words: split on any non-letter characters
		        String[] words = text.split("[^A-Za-z]+");

		        // Convert all words to lowercase for uniform sorting
		        for (int i = 0; i < words.length; i++) {
		            words[i] = words[i].toLowerCase();
		        }

		        // Bubble sort
		        boolean swapped;
		        do {
		            swapped = false;
		            for (int i = 0; i < words.length - 1; i++) {
		                if (words[i].compareTo(words[i + 1]) > 0) {
		                    // Swap words[i] and words[i+1]
		                    String temp = words[i];
		                    words[i] = words[i + 1];
		                    words[i + 1] = temp;
		                    swapped = true;
		                }
		            }
		        } while (swapped);

		        // Output results
		        System.out.println("Words in alphabetical order:\n");
		        for (String word : words) {
		            if (!word.isEmpty()) {  // skip empty results
		                System.out.println(word);
		            }
		        }

	}

}
