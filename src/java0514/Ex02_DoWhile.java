
/*	 Date : 2020.05.14
   	 Author : eunji
   	 Description : do-while문
   	 Version : 1.2
 */

package java0514;

public class Ex02_DoWhile {

	public static void main(String[] args) {
		
		// do-wile
		// while과 do-while의 차이점
		// while은 반복문 실행하기 전에 조건식 검사
		// do-while은 반복문 실행 후 조건식 검사
		// do-while은 무조건 반복문 한번은 실행
		
		/*
		  	do{
		  	
		  		반복할 내용 		
		  	
		  	} while(조건식);
		  
		 */
		int i = 1;
		do {
			System.out.println("do=while에서 i값 : " + i);
			i++; // 반복문을 실행하고
		} while(i <= 10); // 조건식을 확인한다.
		
		while(i<=10){
			System.out.println("while에서 i값 : " + i);
			i++;
		}
		
		
		
		
		

	}

}
