
/*	 Date : 2020.05.14
   	 Author : eunji
   	 Description : do-while문 예제(Up&Down게임)
   	 Version : 1.3
 */

package java0514;

import java.util.Scanner;

public class Ex03_DowhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!

		int answer = (int) (Math.random() * 45) + 1; // 정답은 랜덤으로 지정됨
		int input = 0; // 입력받을 숫자 : 초기화
		int count = 0; // 시도한 숫자 : 초기화

		boolean run = true; // run = 참이면

		Scanner sc = new Scanner(System.in); // scanner로 입력받기
		System.out.println("Up & Down Game시작!");
		System.out.println("(3번안에 맞추면 통과! 그 이후엔 벌칙!)");

		do {

			System.out.println("1부터 45까지 숫자를 말하세요!");
			input = sc.nextInt(); // 내가 입력할 숫자
			count++; // 내가 시도한 숫자

			if (answer > input) { // 만약 내가 입력한 숫자보다 정답이 크면
				System.out.println("Up! 더 큰수를 말하세요!"); // 더 큰수를 입력하라는 프린트 출력

			} else if (answer < input) { // 만약 내가 입력한 숫자보다 정답이 작으면
				System.out.println("Down! 더 작은수를 말하세요!"); // 더 작은수를 입력하라는 프린트 출력

			} else { // 둘다 아니면 아래 출력
				System.out.println("정답은 " + answer + " 입니다.");
				System.out.println("총 시도한 횟수는 " + count + "번 입니다.");
				run = false; // run 참이 아니면 종료해라
				break; // 멈춰라
			}

		} while (run); // while문 종료

		if (count <= 3) {
			System.out.println("통과!");
		} else {
			System.out.println("벌칙ㅠ");
		}

	}

}
