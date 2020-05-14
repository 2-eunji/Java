
/*	 Date : 2020.05.13
   	 Author : eunji
   	 Description : java 3일차 정리
   	 Version : 1.0
 */

package java0512;

public class ex00_day03Summary {

	public static void main(String[] args) {
		// 1. 랜덤메소드 : 0보다 크거나 같고, 1보다 작은
		// 수를 무작위 발생시킨다.
		// 0.0000 ~ 0.9999...
		
		int num = (int)(Math.random() * 10) +1;
		// 1부터 10까지의 숫자중 랜덤으로 발생
		// (int)(Math.random() * N) + S
		// 시작값 : S, 끝나는 값 : N
		
		double dNum = Math.random();
		System.out.println("dNum : " + dNum);
		// 0.285781 =>> 2.85781 =>> 2 =>> 3
		// 0.391815 =>> 3.91815 =>> 3 =>> 4
		// 0.202338 =>> 2.02338 =>> 2 =>> 3
		
		// 2. 조건문 switch-case
		/*
		  	switch(조건변수){
		  	case 변수값1:
		  			해당 조건이 참일때 실행 : 1
		  			break;
		  	case 변수값2:
		  			해당 조건이 참일때 실행 : 2
		  			break;
		  	case 변수값3:
		  			해당 조건이 참일때 실행 : 3
		  			break;		
		  	~~~~~~~
		  	default:
		  			case에서 어떤 조건도 맞지 않을때 실행
		  			break;
		  	}
		 */
		// break가 실행될때까지 다음 case문을 실행한다.
		
		// 3. 반복문 For
		
		/*
		  	for(초기화식, 조건식, 증감식){
		  		반복할 수행문
		  		
		  	}
		  
		 */
		
		
		

	}

}
