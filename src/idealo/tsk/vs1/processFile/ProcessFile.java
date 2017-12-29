package idealo.tsk.vs1.processFile;

/*---------------------------------------------------------
 *  The Coding's task of Idealo 
 *  This code is written by Saeed Ghasemi
 *  Task: process the file (worldlist.txt) 
 *  This program is both readable and fast, and
 *  additionally extendible
 *---------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class ProcessFile {
	//A method for processing any String in order
	//to recognize alphabets from any other signs
	private void  Dictionary (String s){
		StringBuilder sb=new StringBuilder(s);
		StringBuilder sb2=new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			char chr= (sb.charAt(i));
			Boolean b= Character.isLetter(sb.charAt(i));
			if (b ==true){
				sb2.append(chr);
			}

		}
		//Final output
		System.out.println(sb + " --> " +sb2);

	}

	public void processFile(){

		// The name of the file to open.
		String fileName = "Resources/wordlist.txt";

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader to read our wordlist.txt file.
			FileReader fileReader = new FileReader(fileName);

			//wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				//call the method Dictionary here 
				Dictionary (line);
			}   

			// This closes the file.
			bufferedReader.close();         
		}
		catch(FileNotFoundException ex) {
			System.out.println("A problem is occured, the file '" + fileName + 
					"' couldn't be oppened");                
		}
		catch(IOException ex1) {
			System.out.println(	"Error reading file '" 
					+ fileName + "'");                  

		}


	}

}






