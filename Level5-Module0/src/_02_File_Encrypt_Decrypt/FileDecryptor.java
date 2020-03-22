package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	
	
	public static void main(String[] args) {
		FileDecryptor fd = new FileDecryptor();
		
	}
	
	public FileDecryptor
	() {
	String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/newFile.txt"));
			
			 line = br.readLine();
			
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("line: " + line);
		
		
		String output = decryptMessage(line);
		
		System.out.println(output);
		
		JOptionPane.showMessageDialog(null, "Decrypted message: " + output);
	}
	
	String decryptMessage(String message) {
		String decryptedMessage = " ";
		for (int i = 0; i < message.length(); i++) {
			int valInteger = message.charAt(i) + 4;
			
			char valChar = (char) valInteger;
			String valString = Character.toString(valChar);
			decryptedMessage +=  valString;
		}
		return decryptedMessage;
	}
}

	

