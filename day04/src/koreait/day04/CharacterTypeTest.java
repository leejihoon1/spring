package koreait.day04;

import java.util.Scanner;

public class CharacterTypeTest {
	public static void main(String[] args) {// char ascii코드값을 분류합니다.(대문자, 소문자, 숫자, 특수기호)

		// Scanner 로 키보드 입력할 때 문자 입력은 없습니다.
		int ch1;
		Scanner sc = new Scanner(System.in);
		System.out.print("알고 싶은 아스키코드 정수 값 입력하세요 . -> ");
		
		ch1= sc.nextInt();
		
		char ch2 = (char)ch1; // 입력받은 정수 값을 char로 변환 
		
		// 요구사항 : 정수 값에 해당하는 문자 출력하기. 문자 분류 결과 출력하기.
		
		if(ch2 >= 'A' && ch2 <='Z') // 'A' ~ 'Z' 범위 검사
			System.out.println("분류 : 대문자, 입력한 아스키코드값 문자 : " + ch2);
		else if (ch2 >='a' && ch2 <='z') // 'a' ~ 'z' 범위검사
			System.out.println("분류 : 소문자, 입력한 아스키코드값 문자 : " + ch2);
		else if (ch2 >='0' && ch2 <='9') // '0' ~ '9' 범위검사
			System.out.println("분류 : 숫자, 입력한 아스키코드값 문자 : " + ch2);
		// 분류 : 특수기호, 범위를 체크해보세요.(문자 또는 코드 값)코드 값 32 ~ 47, 58 ~ 64, 91~96, 123~126
		else if (ch2 >= 32 && ch2 <= 47 || ch2 >= 58 && ch2 <= 64||
				ch2 >= 91 && ch2 <= 96 ||ch2 >= 123 && ch2 <= 126 )
			System.out.println("분류 : 특수문자, 입력한 아스키 코드 값  : " + ch2);
		else
			System.out.println("분류 : 없음, 알 수 없는 문자" + ch2);
		
		sc.close();
	}
}
// 연산자의 우선순위 : 괄호 없이 여러개의 연산자로 수식을 만들 때 2+3*4/12 ->  * / + 순서, (2+3)*4/12 -> * / 순서
// 기본 규칙 : * 와 /  - > + 와 - 같은 우선순위 일때는 왼쪼에서 오른쪽 순서로 합니다.
// 논리 연산 : && -> || 순서입니다.
