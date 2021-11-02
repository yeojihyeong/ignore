package com.yedam.java.ch02_02;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListener listerner = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁네다아아아아아아아아아아아");
		}
	};
	
	Window(){
		btn1.setOnClickListener(listerner);
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅네다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
				
			}
		});
	}
}
