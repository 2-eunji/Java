
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : while문 예제
   	 Version : 1.11
 */

package java0513;

public class ex11_whileEx {

	public static void main(String[] args) {
		// while문을 이용해서
		// 주사위를 던졌을 때
		// 5가 나오면 종료하는 프러그램을 만드시오.
	boolean run = true;
	int cnt = 0;
	// while(true) 일때 반복문 실행
	// while(false) 일때 반복문 종료.
		while(run) {
			
			double ranNum = Math.random();
			ranNum = (int)(Math.random() * 6) + 1;
			cnt++;
			if(ranNum == 5) {
				run = false;
			}
			System.out.println("던진 주사위는 : " + (int)ranNum);
			
		}System.out.println("\n던진 횟수 : " + cnt);
		 System.out.println("프로그램을 종료합니다.");

	}

}
