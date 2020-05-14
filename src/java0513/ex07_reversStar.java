
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : reversStar
   	 Version : 1.7
 */

package java0513;

public class ex07_reversStar {

	public static void main(String[] args) {
		// *****	i = 1	j = 5
		// ****		i = 2	j = 4
		// ***		i = 3	j = 3
		// **		i = 4	j = 2
		// *		i = 5	j = 1

		int i = 0;
		int j = 0;

		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
