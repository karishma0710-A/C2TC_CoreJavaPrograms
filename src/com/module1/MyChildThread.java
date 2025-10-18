package com.module1;

//Program to define ChildThread 

public class MyChildThread extends Thread {							//connecting with ThreadLifeCycleDemo
	@Override
	public void run() {
		System.out.println("Inside run() Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no < 4) {
			no++;
			System.out.println("number = " + no);
			try {
				sleep(500);

			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}
}
