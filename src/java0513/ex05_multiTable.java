
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : 구구단
   	 Version : 1.5
 */

package java0513;

public class ex05_multiTable {

	public static void main(String[] args) {
		// 중접for문을 이용하여
		// 구구단을 작성해라
		// 2단부터 9단까지!

		int i = 0;
		int j = 0;

		for (i = 1; i <= 9; i++) {

			for (j = 2; j <= 9; j++) {
				if (j % 2 == 0) {//j가 짝수다
					continue;
				}

				System.out.print(j + "X" + i + "=" + i * j);
				System.out.print("\t");

			}

			System.out.println();
			}
		}
	}

