package Ch05_02;

public class Ch05_02 {

	public static void main(String[] args) {
		//int[] scores = new int[30]; //  | 0 | 0 | 0 | 값 입력안할 경우 0 입력 
		int scores[] = { 83, 90 ,87 };
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[0] : " + scores[1]);
		System.out.println("scores[0] : " + scores[2]);

	int sum = 0;
	for (int i =0 ; i < 3 ; i++) {
		sum+=scores[i];
	}
	System.out.println("총합 : " + sum);
	double avg = (double) sum/3;
	System.out.println("평균 : " + avg);
	
	int[] scores1;
	scores1 = new int[] {81, 82, 89};
	
	for (int i = 0 ; i < 3 ; i++) {
		System.out.println("scores1[" + i + "] = " + scores1[i]);
		}
	
	int result = add(new int[] {83, 90, 87});
	System.out.println(result);
	System.out.println("=====================================================");

	int arr1[] = new int[3];
	for(int i =0; i<3 ; i++) {
		System.out.println("arr1[" + i + "] =" +arr1[i]);
	}
	System.out.println("=====================================================");

	arr1[0] = 10;
	arr1[1] = 20;
	arr1[2] = 30;
	for(int i =0; i<3 ; i++) {
		System.out.println("arr1[" + i + "] =" +arr1[i]);
	}
	System.out.println("=====================================================");
	
	String arr2[] = new String[3]; //배열생성
	//string str = new string();  //스트링 생성
	for(int i =0; i<3 ; i++) {
		System.out.println("arr2[" + i + "] =" +arr2[i]);
	}
	
	arr2[0] = "1월";
	arr2[1] = "2월";
	arr2[2] = "3월";
	for(int i =0; i<3 ; i++) {
		System.out.println("arr2[" + i + "] =" +arr2[i]);
	}
	System.out.println("=====================================================");
	
	int[] scores3 = { 356,43456,237778};
	int sum3 = 0;
	for(int i = 0 ; i <scores3.length;i++)
		sum3 +=scores3[i];
	
	double avg3 =(double) sum3 / scores3.length;
	System.out.println("총합 : " + sum3);
	System.out.println("평균 : " + avg3);
	
	
	
	
	}
	
	public static int add (int[] scores) {
		int sum = 0;
		for(int i=0 ; i<3; i++) {
			sum +=scores[i];
		}
		return sum;
	}
}
	