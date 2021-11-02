package Ch05_02;

import java.util.Scanner;

public class Ch05_02test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true; //while 조건문
		int studentNum = 0; //학생 수
		int[] scores = null;  //학생 점수
		int max = 0;
		int sum = 0;
		double avg = 0;
		Outter: while(run) {
			System.out.println("==============================================");
			System.out.println("1. 학생수 |2. 점수입력 |3. 점수리포트 |4. 분석 |5.종료");
			System.out.println("==============================================");
			System.out.printf("선택 > ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수 : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				System.out.println("점수입력: ");
				for(int i = 0 ; i < studentNum ; i++) {
					scores[i] = scanner.nextInt();
					System.out.println("scores[" + i + "] = " + scores[i]);
				}
				break;
			case 3:
				System.out.println("점수 리스트");
				for(int i = 0 ; i < scores.length ; i++)
				{
				 System.out.println("scores[" + i +"] : " + scores[i]);
				}
				
				break;
			case 4:
				System.out.println("분석");
				for
				(int i = 0 ; i < scores.length ; i++)
				{
					if ( scores[i] > max) {
						max = scores[i];
						sum= sum+scores[i];
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " +  (double) sum / scores.length);
				break ;
			case 5:
				System.out.println("프로그램 종료");
			
				break Outter;
			}
				
				
			}
					
			
		}
		
		
	}