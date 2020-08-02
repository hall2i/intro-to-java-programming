package ch_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * *20.1 (Display words in ascending alphabetical order) Write a program that
 * reads words from a text file and displays all the words (duplicates allowed)
 * in ascending alphabetical order. The words must start with a letter. The text
 * file is passed as a command-line argument
 */

public class E2001 {

	public static void main(String... args) {
		List<String> words = new ArrayList<>();
		File file = new File("/java-prog-dan-lang-10th/src/ch_20/W.txt");
		try (Scanner fileInput = new Scanner(file)) {
			while (fileInput.hasNext()) {
				words.add(fileInput.next());

			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");

		}
		
		System.out.println(words);


	}
}
