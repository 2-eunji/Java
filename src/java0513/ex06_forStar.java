
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : 별찍기 예제
   	 Version : 1.6
 */

package java0513;

	public class ex06_forStar{

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		int i = 0;
		int j = 0;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
