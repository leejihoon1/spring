package koreait.day04;

public class ForTest1 {// 반복되는 명령들을 실행하는 for문 연습합니다.
	public static void main(String[] args) {
		
		//명령문의 반복1
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		
		//명령문의 반복2
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		
		for(int i =0; i < 5; i++) {   		  // 반복 횟수 제어를 위한 변수 i
			System.out.println("hello!!!!!"); // 반복되는 부분
		}
		for(int i = 0; i <0; i++) { 
			System.out.println("헬로우!!!!!!");
		}
//		for(int i =0; i<5; i++) {
//			System.out.println("헬로우 ! (" + i + ")"); // i=0, 0 < 5 참 -> 출력 실행 -> i++
//		}
		for(int i =1; i<=5; i++) {
			System.out.println("헬로우 ! (" + i + ")");
		}
		
		// 조건식에 변수를 활용합니다.
		int end = 100;
		for(int i =0; i < end; i+=2) // i += 2 는  i = i +2;
			System.out.println("i = " + i);
	}
}
