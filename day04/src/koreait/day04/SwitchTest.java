package koreait.day04;

import java.util.Scanner;

//1:장바구니  2:상품목록  3:결제  4:배송조회   5:종료

public class SwitchTest {// if문을 switch문로 바꾸는 연습입니다.
	public static void main(String[] args) {

		// import 한번에 하는 단축키 : Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		int menu;

		System.out.println("[[사용자메뉴]]");
		System.out.println("1:장바구니  2:상품목록  3:결제  4:배송조회  5:종료");
		System.out.print("선택하세요 -> ");

		menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("장바구니로 이동합니다.");
		} else if (menu == 2) {
			System.out.println("상품목록으로 이동합니다.");
		} else if (menu == 3) {
			System.out.println("결제화면으로 이동합니다.");
		} else if (menu == 4) {
			System.out.println("배송조회로 이동합니다.");
		} else if (menu == 5) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못된 선택입니다.");
		}

		System.out.println("[[If문 프로그램 종료]]");
		// 위의 조건식은 ==(같다) 비교로 여러개의 else if를 사용합니다.
		// -> 이런 경우 switch문을 사용할 수 있습니다.
		System.out.println("\n\n:::switch로 동일한 테스트:::");
		switch (menu) {
		case 1: // 비교 할 수 있는 데이터 형식 : 정수형식, char, String("", 문자열)
			System.out.println("장바구니로 이동합니다.");
			break; // 조건식에 맞는 break를 만나면 Switch문을 빠져 나간다.
		case 2:
			System.out.println("상품목록으로 이동합니다.");
			break;
		case 3:
			System.out.println("결제화면으로 이동합니다.");
		case 4:
			System.out.println("배송조회로 이동합니다.");
		case 5:
			System.out.println("프로그램을 종료합니다.");

		default: // menu가 1, 2, 3, 4, 5 중 해당되는 값이 아닐 떄 실행.
			System.out.println("잘못된 선택입니다.");
			break;
		}
		System.out.println("[[Switch문 프로그램 종료]]");
		sc.close();
	}
	// 들여쓰기 자동 : Ctrl + Shift + F
}
