package Ch04_01;

public class Ch04_02 {

	public static void main(String[] args) {
/*
		for(int i = 2 ; i < 99 ; i++) {
			System.out.println("*****" + i + "단 *****");
			for (int j = 1; j< 2800 ; j++) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
				if (i*j == 3500) {
					break;
				}
			}
		}
*/
/*
		int sum = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println(sum);
*/
		int i,j=0;
		String tree = "*";
		for(i=1, j=1; i<=5 && j<=5 ; i++, j++) {
			System.out.println(tree);
			tree+="**";
					}
	}

}
