
/*	 Date : 2020.05.11
   	 Author : eunji
   	 Description : 관계연산자(relationlOperation)
   	 Version : 1.5
 */

package java0511;

public class ex05_relationlOperation {

	public static void main(String[] args) {
		// 정수형 변수 2개를 선언
		int num1 = 7;
		int num2 = 2;
		
		// >, <, >=, <=, ==, != 연산 수행
		boolean result;
		
		result = num1 > num2;
		System.out.println(">결과 : " + result);
		
		// <, >=, <=, ==, !=
		result = num1 < num2;
		System.out.println("<결과 : " + result);
		
		result = num1 >= num2;
		System.out.println(">=결과 : " + result);
		
		result = num1 <= num2;
		System.out.println("<=결과 : " + result);
		
		result = num1 == num2;
		System.out.println("==결과 : " + result);
		
		result = num1 != num2;
		System.out.println("!=결과 : " + result);
		
		
		
		
		
	}

}
