package Ch05_01;

public class Ch05_01 {

	public static void main(String[] args) {
		String strVar1 = "신미철"; //신미철이라는 값을 가지는 String객체가 힙영역에 생성
		String strVar2 = "신미철"; //신미철이라는 값을 가지는 String객체를 참조.
		
		if(strVar1 ==strVar2) {
			System.out.println("strvalue1 과 strvalue2는 참조가 같음");
		}else {
			System.out.println("strvalue1 과 strvalue2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철"); //참조타입 타입명 = new 참조타입()
		String strVar4 = new String("신민철");
		
		if(strVar3 ==strVar4) {
			System.out.println("strvalue3 과 strvalue4는 참조가 같음");
		}else {
			System.out.println("strvalue3 과 strvalue4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}

}
