package com.yedam.java.ch01;

public class Example {
	public static void main(String[] args) {
		// NullPointerException
		// String date=null;
		// System.out.println(date.toString());

		// ArrayIndexOutOfBoundsException
		/*
		 * String data1 = args[0]; String data2 = args[1];
		 * 
		 * System.out.println("agr[0] : " + data1); System.out.println("agr[1] : " +
		 * data2);
		 * 
		 * 
		 * if(args.length ==2) { String data1 = args[0]; String data2 = args[1];
		 * 
		 * System.out.println("agr[0] : " + data1); System.out.println("agr[1] : " +
		 * data2); } else { System.out.println("두 개의 매개값이 필요합니다."); }
		 * System.out.println(); //NumberFormatException String data3 = "100"; String
		 * data4 = "1100";
		 * 
		 * int value1 = Integer.parseInt(data3); int value2 = Integer.parseInt(data4);
		 * 
		 * int result = value1+value2; System.out.println(result);
		 */
		// ClassCastException

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}