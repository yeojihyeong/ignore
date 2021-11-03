package com.yedam.java.ch03_02;

public class Main {

	public static void main(String[] args) {
	
	

		
		System.out.println("===============================");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		
		
	}

