package idealo.tsk.vs1.main;


/*---------------------------------------------------------
 *  The Coding's task of Idealo 
 *  This code is written by Saeed Ghasemi
 *  Task: process the file (worldlist.txt) 
 *  This program is both readable and fast, and
 *  also extendible
 *---------------------------------------------------------*/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException{
		ProcessFile pf=new ProcessFile();
		pf.processFile();
	}

}
