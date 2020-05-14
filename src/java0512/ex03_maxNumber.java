
/*	 Date : 2020.05.12
   	 Author : eunji
   	 Description : 최댓값구하기(maxNumber)
   	 Version : 1.3
 */

package java0512;

import java.util.Scanner;

public class ex03_maxNumber {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수를 출력하기
		Scanner sc = new Scanner(System.in);
//
//		int num1, num2, max;
//
//		System.out.println("첫번째 숫자>> ");
//		num1 = sc.nextInt();
//		System.out.println("두번째 숫자>> ");
//		num2 = sc.nextInt();
//
//		if (num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		System.out.println("최댓값 : " + max);

		// 숫자 3개를 입력받아서 최댓값 구하기
		int num3, num4, num5, max;

		System.out.println("첫번째 숫자 : ");
		num3 = sc.nextInt();
		System.out.println("두번째 숫자 : ");
		num4 = sc.nextInt();
		System.out.println("세번째 숫자 : ");
		num5 = sc.nextInt();
//
//		if (num3 > num4) {
//			max = num3;
//			if (num3 > num5) {
//				max = num3;
//			} else {
//				max = num5;
//			}
//
//		} else if (num4 > num5) {
//			max = num4;
//		} else {
//			max = num5;
//		}

		if(num3 > num4 && num3 > num5) {
			max = num3;
		} else if(num4 > num5) {
			max = num4;
		} else {
			max = num5;
		}
		System.out.println("최댓값은 : " + max + " 입니다.");

	}
}
