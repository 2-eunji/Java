
/*	 Date : 2020.05.14
   	 Author : eunji
   	 Description : while문을 사용한 예제2
   	 Version : 1.1
 */

package java0514;

import java.util.Scanner;

public class Ex01_WhileEx {

	public static void main(String[] args) {
		int account = 0;
		int menu;
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("메뉴를 선택하세요>>");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("예금액>>");
				int a = sc.nextInt();
			//  account += a;
				account += a; // +해주기
				break;  // switch문 탈출
			case 2:
				System.out.print("출금액>>");
				account -= sc.nextInt(); // -해주기
				break;
			case 3:
				System.out.println("잔고 : " + account); // 해당금액 출력하기
				
				break;
			case 4:
				run = false;
				break;
				// break를 사용하면 while문을 나갈 수 없음. true값을 false로 변경해야함.
			default:
				System.out.println("다시 입력해주세요.\n");
			} // switch문 종료
				
		}System.out.println("프로그램을 종료합니다.");

	}

}
