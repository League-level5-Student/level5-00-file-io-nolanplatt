package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	
	public static void main(String[] args) {
		
		String stringToWriteToFile = JOptionPane.showInputDialog("What would you like to write to a file?");
		
		FileWriter fw;
		try {
			fw = new FileWriter("src/_01_File_Recorder/newFile.txt");
			fw.write("\n" + stringToWriteToFile);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
		
		
		
		
	}
}
