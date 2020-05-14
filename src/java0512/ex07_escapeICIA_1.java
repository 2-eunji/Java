/*	
	Date : 12.May.2020
	Author : Jaehyun, junehee, eunji, dongsun
	Description : escapeICIA
	Ver. 1.7_2
*/

package java0512;

import java.util.Scanner;

public class ex07_escapeICIA_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int num1;
		String thema = "";
		String succes = "";
		String fear = "";

		System.out.println("icia escape 에 오신것을 환영합니다.");
		System.out.println("테마를 선택하세요.\t");

		System.out.println("1. C강의실 탈출하기\t\t2. 피로물든 상담실");
		System.out.println("3. 원장님의 이중생활\t\t4. 잡카페의 미스테리");
		System.out.print(">>");

		num = sc.nextInt();

		switch (num) {
		case 1:
			thema = "C강의실 탈출하기";
			succes = "70%";
			fear = "★☆☆☆☆";
			break;

		case 2:
			thema = "피로물든 상담실";
			succes = "25%";
			fear = "★★★★★";

			break;
		case 3:
			thema = "원장님의 이중생활";
			succes = "60%";
			fear = "★★☆☆☆";
			break;

		case 4:
			thema = "잡카페의 미스테리";
			succes = "10%";
			fear = "측정불가";
			break;

		default:
			System.out.println("해당 테마는 없습니다.");
			break;
		}
		if (num >= 1 && num <= 4) {
			System.out.println("선택하신 테마는 " + thema + "입니다.");
			System.out.println("성공률은 " + succes + "이고 공포도는 " + fear + "입니다.");
			System.out.println("선택하시겠습니까?");
		}

		System.out.println("1. yes  2.no");
		System.out.print(">>");
		num1 = sc.nextInt();

		if (num1 == 1) {
			System.out.println("선택 되었습니다.");
		} else {
			System.out.println("취소되었습니다.");
			System.out.println("테마를 선택하세요.\t");

			System.out.println("1. C강의실 탈출하기\t\t2. 피로물든 상담실");
			System.out.println("3. 원장님의 이중생활\t\t4. 잡카페의 미스테리");
			System.out.print(">>");

			num = sc.nextInt();

			switch (num) {
			case 1:
				thema = "C강의실 탈출하기";
				succes = "70%";
				fear = "★☆☆☆☆";
				break;

			case 2:
				thema = "피로물든 상담실";
				succes = "25%";
				fear = "★★★★★";

				break;
			case 3:
				thema = "원장님의 이중생활";
				succes = "60%";
				fear = "★★☆☆☆";
				break;

			case 4:
				thema = "잡카페의 미스테리";
				succes = "10%";
				fear = "측정불가";
				break;

			default:
				System.out.println("해당 테마는 없습니다.");
				break;
			}
			if (num >= 1 && num <= 4) {
				System.out.println("선택하신 테마는 " + thema + "입니다.");
				System.out.println("성공률은 " + succes + "이고 공포도는 " + fear + "입니다.");
				System.out.println("선택하시겠습니까?");
			}

			System.out.println("1. yes  2.no");
			System.out.print(">>");
			num1 = sc.nextInt();
			System.out.println("감사합니다.");
		}
	}
}
