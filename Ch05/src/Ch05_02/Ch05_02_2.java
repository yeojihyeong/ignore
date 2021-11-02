package Ch05_02;

public class Ch05_02_2 {

	public static void main(String[] args) {
/*		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + " = " + result);
	
		
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0 ; i < array.length ; i++)
			if ( max < array[i]) {
				max = array[i];
			}
		
		System.out.println("max : " + max);
		
		
		int a=(int)(Math.random()*6)+1;
		int b=(int)(Math.random()*6)+1;
		int sum = 1;
		
		System.out.println("첫번째 주사위 : " + a + ", 두번째 주사위 : " +b);
		while(true) {
			a=(int)(Math.random()*6)+1;
			b=(int)(Math.random()*6)+1;
			System.out.println("첫번째 주사위 : " + a + ", 두번째 주사위 : " +b);	
			sum += 1;
			if (a+b ==5) {
			System.out.println("두개의 주사위 합" +(a+b));	
				break;
			}
		}
		System.out.println("돌린 횟수" + sum);
*/
		
		
		int[][] score = new int[2][3];
		int[] score1 = new int[3];
		int[] score2 = new int[3];
		
//		int[][] scoreArray = new int[][2];
//		scoreArray[0] = score1;
		
		int[][] mathScores = new int[2][3];
		
		for(int x = 0 ; x<mathScores.length ; x++) {
		System.out.println(mathScores[x]);
     
		 for(int y = 0; y<mathScores[x].length ; y++ ) {
			 System.out.println(mathScores[x][y]);
		 	}	
		}
		
		System.out.println("===========================================");
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[5];
		englishScores[1] = new int[3];
		
		System.out.println(englishScores.length);
		
		for(int x = 0 ; x<englishScores.length; x++) {
			System.out.println(englishScores[x].length);
			for(int y=0 ; y<englishScores[x].length; y++) {
				System.out.println(englishScores[x][y]);
			}
		}
		
		
		int[] temp = { 89, 75, 60};
		int[][] javaScores = { {75, 80}, {72,61, 15}, {5,7,9}};
		
		for (int x=0 ; x <javaScores.length; x++) {
			// int[] java = javaScores[x];
			for (int y=0; y<javaScores[x].length ; y++)
			{
				int ja = javaScores[x][y];
				 System.out.println(ja);
			}
		}
		
		int[] oldIntArray = { 1, 2, 3};
		int[] newIntArray = new int[5];
		for(int i =0 ; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0 ; i < newIntArray.length ; i++) {
			System.out.println(newIntArray[i]);
		}
		
		
		//System.arraycopy() -> 배열 복사
		
		String[] oldStrArray = { "java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0 ; i < newStrArray.length ; i++) {
			System.out.println(newStrArray[i]);		
		}
	
		int sum3 = 0;
		int[] scoresList = { 95, 71, 84, 93, 87 };
		for(int score3 : scoresList) {
			System.out.println(score3);
			sum3 +=score3; 
		}
		System.out.println(" 총 합 : " + sum3);
		double avg3 = (double) sum3 / scoresList.length;
		System.out.println(" 평 균 : " + avg3);
	}
}
