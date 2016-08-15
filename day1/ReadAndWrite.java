package com.week3.day1;

import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

public class ReadAndWrite {

	ArrayList<String> countryList = new ArrayList<>();
	Path ourNewPath = Paths
			.get("\\Users\\admin\\newWorkspace\\August 15 Assignment\\src\\com\\week3\\day1\\CountryList");
	File aNewFile = ourNewPath.toFile();

	public void read() {

		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile))) {

			String countryName;
			while ((countryName = in.readLine()) != null) {
				countryList.add(countryName); 		// add country from file to arraylist
				System.out.println(countryName);
			
			} in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void write(String addACountry) { 	// pass in user input county name

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true)))) {
			out.println(addACountry);

			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
