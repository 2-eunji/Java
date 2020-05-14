
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : S부터 N까지 합 구하기_1
   	 Version : 1.2_1
 */

package java0513;

import java.util.Scanner;

public class ex02_1forSumToLnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int strNum = 0;
		int endNum = 0;
		int sum = 0;

		System.out.println("시작값 : ");
		strNum = sc.nextInt();

		System.out.println("끝나는 값 : ");
		endNum = sc.nextInt();

		for(int i = strNum; i <= endNum; i++) {
			sum += i;
		// sum = sum + i;
		if(i<endNum) {
			System.out.print(i);
			System.out.print(" + ");
		} else {
			System.out.print(i);
			System.out.print(" = " + sum);
		}
		
		}
			
		System.out.println();
		System.out.println(strNum + " 부터 " + endNum + " 까지의 합은 " + sum + " 입니다.");
		/*
  			for(int i = strNum; i <= endNum; i++) {
			sum += i;
			System.out.print(i)
		
		if(i<endNum) {
			System.out.print(" + ");
		} else {
			System.out.print(" = " + sum);
		}
		}	
		System.out.println();
		System.out.println(strNum + " 부터 " + endNum + " 까지의 합은 " + sum + " 입니다.")
		 */
	}

}
