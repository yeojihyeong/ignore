package com.yedam.java.ch02_02;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 20;
	//	arg1 = 30;
	//	arg2 = 60;
		
	//	var1 = 80;
	//	var2 = 100;
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1+arg2 + var1+var2;
				return 0;
			}
			
		};
		System.out.println(calc.sum());
	}
}
