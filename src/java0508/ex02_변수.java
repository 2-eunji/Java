
/*	 Date : 2020.05.08
   	 Author : eunji
   	 Description : Java_변수
   	 Version : 1.0
 */

package java0508;

public class ex02_변수 {

	public static void main(String[] args) {

		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고, 이름을 부여한것

		// var num = 0;
		// [변수타입] [변수명] = [변수값];

		int age = 35;

		int age1; // 변수선언
		age1 = 35; // 변수초기화
		
		int age2=11, age3=12, age4=13;
		
		age1 = 10;
		System.out.println("age1" + age1); 
		// 위에서 35로 선언했지만 초기화가 됬고, 
		// 마지막 남은 10만 값으로 출력된다.

		//  변수타입 1byte 2byte 4byte 8byte
		// 1. 정수형 (byte, short, int, iong)
		// 2. 실수형 (float, double)
		// 3. 문자형 (char)
		// 4. 논리형 (boolean)

		// byte
		// 1byte = 8bit
		// 1byte = -2^7 ~ (2^7)-1

		byte bNum1 = -128;
		byte bNum2 = 127;

		// short
		// 2byte = 16bit
		// 2byte = -2^15 ~ (2^15)-1

		short sNum1 = -32768;
		short sNum2 = 32767;

		// 4byte = 32bit
		// 4byte = 2^31 ~ (2^31)-1
		// int : -2,147,483,648 ~ 2,147,483,647

		int iNum1 = -129;
		int iNum2 = 128;

		// long : 매우크다
		// 8byte = 64bit

		long lNum1 = -2147483648L;
		// 변수값에는 L을 썻지만 출력에는 나오지 않는다.
		long lNum2 = 2148483648L;
		System.out.println(lNum1);
		System.out.println(lNum2);

		// 실수형
		// float(4byte), double(8byte)
		// double > float

		float pi1 = 3.14f;
		double pi2 = 3.14;

		// 대ㆍ소문자 가능하지만 아래와 같이 사용하기!
		// long은 L 추가 (대문자)
		// float는 f 추가 (소문자)

	}

}
