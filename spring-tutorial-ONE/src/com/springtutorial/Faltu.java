package com.springtutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Faltu {
	private int index ;
	public static void main(String[] args) throws InterruptedException {
		setIndex();
		
	}

	public static void setIndex() throws InterruptedException {
		ExecutorService executor = Executors.newWorkStealingPool();
		List<Callable<Integer>> callables = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
		    callables.add(() -> {
		         return random.nextInt();
		    });
		}
		executor.invokeAll(callables);
	}

}
