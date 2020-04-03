package com.springtutorial.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	// create a array of strings
//	public String[] data = {"Beware of the wolf in sheep's clothing",
//						    "Diligence is the mother of good luck",
//						    "The journey is the reward"};
	private String fileName = "C:/Ravindra/fortune-data.txt";
	private List<String> theFortunes;
	
	//Create a random number generator
	private Random random = new Random();
	private File file = new File(fileName);
	@PostConstruct
	public void init() {
		
		System.out.println("Reading fortunes from the file: "+file);
		System.out.println("File exists : "+file.exists());
	}
	public RandomFortuneService() {
		
		theFortunes = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String temp;
			while((temp = br.readLine())!= null) {
				theFortunes.add(temp);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public String getFortune() {
		// Pick a random String from the array
		int index = random.nextInt(theFortunes.size());// gives random number
		String theFortune = theFortunes.get(index);
		return theFortune;
	}

}
