package Ch04_02;

public class Ch04_02 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("==============" + i + "단 출력===============");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	
		for (int i = 7; i >= 0; i--) {
			for(int j =i ; j<=7; j++) {
				System.out.printf("*");
			}
System.out.println("");
		}
		int i = 0;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			System.out.println(i);
			i++;
		}
		System.out.println(sum);

		int sum1 = 0;

		while (i <= 100) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);

		int index = 1;

		while (index != 1) {
			System.out.println("while문이 " + index + "번 실행됩니다.");
		}

		do {
			System.out.println("do while문이 " + index + "번 실행됩니다.");
		} while (index != 1);

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}

		}
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		for(int a= 1 ; a<=10 ; a++) {
			if(a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
		
	}
}
