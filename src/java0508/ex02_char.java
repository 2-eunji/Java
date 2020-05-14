
/*	 Date : 2020.05.08
   	 Author : eunji
   	 Description : ex02_char
   	 Version : 1.0
 */

package java0508;

public class ex02_char {

	public static void main(String[] args) {

		// 문자형 변수타입 char(2byte)
		char ch1;
		ch1 = 'A';

		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int) ch1);
		// 문자형을 숫자로 바꿀때 변수명 앞에(int)

		char ch2 = 'B'; // 66
		System.out.println((int) ch2);

		char ch3 = 'a'; // 97
		char ch4 = 'b'; // 98
		System.out.println((int) ch3);
		System.out.println((int) ch4);

		int num1 = 65;
		System.out.println((char) num1);
		// 숫자를 문자형으로 바꿀때 변수명 앞에 (char)

		// 문제!
		// 본인이름을 숫자로 표시해보세요.

		char ch5 = '이'; // 51060
		System.out.println((int) ch5);
		char ch6 = '은'; // 51008
		System.out.println((int) ch6);
		char ch7 = '지'; // 51648
		System.out.println((int) ch7);

		int num2 = 51060;
		System.out.println((char) num2);
		int num3 = 51008;
		System.out.println((char) num3);
		int num4 = 51648;
		System.out.println((char) num4);

		// 한글 외에도 일본어, 한자 등 사용 가능
	}

}
