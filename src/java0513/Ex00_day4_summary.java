
/*	 Date : 2020.05.14
   	 Author : eunji
   	 Description : 4일차 정리
   	 Version : 1.0
 */

package java0513;

public class Ex00_day4_summary {

	public static void main(String[] args) {
		// 1. 반복문 for
		/*
		  	for(①초기화식; ②조건식; ④증감식){
		  	
		  		③수행할 반복문 내용
		  	}
		  	
		  	① 초기화식 it i = 1
		  	② 조건식 i <= 10
		  	③ (참일경우) 수행할 반복문 내용
		  	  (거짓일 경우) 반복문 종료
		  	④ 증감식 
		    ② 조건식 
		 */
		
		// 2. 중첩 for문 ex) 구구단
		
		/*
		  	for(초기화식; 조건식; 증감식){
		  		
		  		for(초기화식; 조건식; 증갑식){
		  			수행할 반복문 내용
		  			// (외부for문 x 내부for문)
		  		}
		  		// 내부 for문
		  	}
		  
		  
		 */
		
		// 3. continue문		ex) 홀수, 짝수 구하기
		// 반복문과 함께 사용
		// continue가 실행되면 이후 반복문 내용은 실행되지 않는다.
		// 다시 증감식으로 
		
		/*
		  	for(초기화식; 조건식; 증감식){
		  	
		  		수행할 반복문 내용1;
		  		continue; → continue 사용하게 되면 반복문 내용2,3 거치지 않고 증감식으로
		  		
		  		수행할 반복문 내용2;
		  		수행할 반복문 내용3;
		  	
		  	}
		  
		  
		 */
		
		// 4. 별찍기 예제
		// 시간될때 한줄씩 해보면서 주석달기!
		
		// 5. while
		// (1) for 비슷하게 사용
		
		/*
		  	초기화식
		  	while(조건식){
		  		반복할 내용
		  		증감식
		  		
		  	}
		  
		 */
		
		int i = 1;	// 초기화식
		while(i<=10) { // 조건식
			System.out.print(i + " "); // 반복내용
			i++; // 증감식
			
		}
		System.out.println();
		System.out.println("while문 이후 i값 : " + i);
		
		// (2) 반복횟수 정하지 않고 사용하는 방법
		
		/*
	  		boolean 조건변수 = true;
	  		
	  		while(조건변수){
	  			반복할 내용
	  			
	  			// 반복문 종료
	  			1) 조건변수를 false 만들기
	  			2) break;
	  	}
	  
	 */
		
		

	}

}
