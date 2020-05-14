
/*	 Date : 2020.05.08
   	 Author : eunji
   	 Description : ex02_boolean
   	 Version : 1.0
 */

package java0508;

public class ex02_boolean {

	public static void main(String[] args) {

		// 논리형
		// boolean ( Y / N ) =>> true / false

		int num1, num2;
		num1 = 1;
		num2 = 2;

		boolean bool1 = true;
		System.out.println(bool1);

		boolean bool2 = false;
		System.out.println(bool2);

		boolean bool3;

		if (num1 > num2) {
			bool3 = false;
		} else {
			bool3 = true;

		}

		System.out.println(bool3);
	}

}
