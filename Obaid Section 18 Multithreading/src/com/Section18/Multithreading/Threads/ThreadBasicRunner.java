package com.Section18.Multithreading.Threads;

class Task1 extends Thread {
	public void run() {
		
		System.out.print("\nTask1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");
		System.out.print("\nTask1 Done");

	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		
		System.out.print("\nTask2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		System.out.print("\nTask2 Done");
		
	}
	
}

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\nTask1 Kicked Off");
		
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();//
		
		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.setPriority(10);
		task2thread.start();

	task1.join();
	task2thread.join();

		// Task 3
	System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");

		System.out.print("\nTask3 Done");

		System.out.print("\nMain Done");

	}

}
