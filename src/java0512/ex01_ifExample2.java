
/*	 Date : 2020.05.12
   	 Author : eunji
   	 Description : 조건문연습문제2
   	 Version : 1.1
 */

package java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) { // 메인함수
		// 스캐너를 사용해서 국어, 영어, 수학점수를
		// 입력받아서 총점, 평균을 구하시오.
		// 평균점수를 이용하여
		// A+, A, B+, B, C+, C, D+, D, F
		// 프로그램을 만들어보시오!

		Scanner sc = new Scanner(System.in);

		int Kor;
		System.out.println("국어점수");
		Kor = sc.nextInt();

		int Eng;
		System.out.println("영어점수");
		Eng = sc.nextInt();

		int Mat;
		System.out.println("수학점수");
		Mat = sc.nextInt();

		double tot = (Kor + Eng + Mat);
		System.out.println("총점은 : " + tot);
		double avg = (tot / 3);
		System.out.println("평균은 : " + avg);

		String grade;

		if (avg <= 100) {
			if (avg >= 90) {
				if (avg >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (avg >= 80) {
				if (avg >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (avg >= 70) {
				if (avg >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (avg >= 60) {
				if (avg >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은 : " + grade + "입니다!");
		} else {
			System.out.println("입력범위를 초과하였습니다.");
		}

	}
}
