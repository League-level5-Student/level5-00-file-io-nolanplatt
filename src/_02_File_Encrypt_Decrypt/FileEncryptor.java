package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	
	public static void main(String[] args) {
		FileEncryptor fe = new FileEncryptor();
		
	}
	
	public FileEncryptor() {
		String messageFromUser = JOptionPane.showInputDialog("Enter a message...");
		
		String keyFromUser = JOptionPane.showInputDialog("Enter encryption key...");
		
		int keyFromUserParsed = Integer.parseInt(keyFromUser);
		
		
		
		String output = encryptMessage(messageFromUser, keyFromUserParsed);
		
		//System.out.println(output);
			
		FileWriter fw;
		try {
			fw = new FileWriter("src/_02_File_Encrypt_Decrypt/newFile.txt");
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	String encryptMessage(String message, int key) {
		String encryptedMessage = " ";
		for (int i = 0; i < message.length(); i++) {
			int valInteger = message.charAt(i) - key;
			
			char valChar = (char) valInteger;
			String valString = Character.toString(valChar);
			encryptedMessage +=  valString;
		}
		return encryptedMessage;
	}
}
