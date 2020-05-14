
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : S부터 N까지 합 구하기
   	 Version : 1.2
 */

package java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		// for문 사용해서
		// 두개의 정수(시작값, 끝나는 값)를 입력받아서
		// 총합을 구하는 프로그램 만들어 보시오.
		
		Scanner sc = new Scanner(System.in);
		
		int strNum=0;
		int endNum=0;
		int sum=0;

		System.out.println("시작값 : ");
		strNum = sc.nextInt();
		
		System.out.println("끝나는 값 : ");
		endNum = sc.nextInt();
		
		for(int i=strNum; i<=endNum; i++) {
			sum += i;
			// sum = sum + i;
			}
		System.out.println(strNum + " 부터 " + endNum + " 까지의 합은 " + sum + "입니다." );
		
	}

}
