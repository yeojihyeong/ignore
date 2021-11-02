package com.yedam.java.ch02_02;

public class Button {
	//필드
	OnClickListener listener;
	
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//메소드
	void touch() {
		listener.onClick();
	}
	
	//중첩인터페이스
	static interface OnClickListener{
		void onClick();
	}
}
