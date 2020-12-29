package com.HG;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class Vending {

	public static void main(String[] args) {
		try{
			FileInputStream fis= new FileInputStream("data.txt");
			InputStreamReader si= new InputStreamReader(fis);
			BufferedReader bi = new BufferedReader(si);
			String s = bi.readLine();
			System.out.println(s);
			s=bi.readLine();
			System.out.println(s);
			s=bi.readLine();
			System.out.println(s);
			s=bi.readLine();
			System.out.println(s);
			s=bi.readLine();
			System.out.println(s);
			s=bi.readLine();
			System.out.println(s);
			s=bi.readLine();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Error reading");
		}
		
		
		
		
		
		
		
		/*try {
			FileReader reader =new FileReader("data1.txt");
			System.out.println("file opened");
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("End");*/
	}

}
