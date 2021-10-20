package Ch04_01;

import java.util.Scanner;

public class Test_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ( year %4 == 0 ) {
			if (year% 100 != 0 || year % 400 ==0) {
				System.out.println(year + "년은 윤년입니다.");
			}
			else {
				System.out.println(year + "년은 윤년이 아닙니다.");
			}		
		}
		else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		String value = scanner.next();
		switch (value) {
		case "가위" :
		System.out.println("이길려면 바위를 내셔야 합니다.");
		break;
		case "바위" :
			System.out.println("이길려면 보를 내셔야 합니다.");
			break;
		default :
			System.out.println("이길려면 가위를 내셔야 합니다.");
			break;
		}
		
		String str2 = "*";
		for (int z=1 ; z<= 5 ; z++) {
			System.out.println(str2);
			str2+="*";
		}
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		for(int x=1; x<n; x++)
		{
			System.out.println(m +"*" + x +" = ");
		}
		
	}
	

}
