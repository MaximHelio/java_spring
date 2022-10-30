package chap03.Ex12_Class;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {

		System.out.println(Math.PI);			//3.141592653589793(원주율)
		System.out.println(Math.ceil(3.125));	// 올림
		System.out.println(Math.floor(3.75));	// 내림
		System.out.println(Math.sqrt(9));		// 제곱근
		System.out.println(Math.pow(3, 2));		// 3의 2제곱
		System.out.println(Math.exp(2));		// e의 2승
		System.out.println(Math.round(3.14));   // 반올림
		

		System.out.println("Math.random():" + Math.random());

		// [1, 45] 사이의 정수형 난수 5개 생성
		// Math.random()					: 0.0보다 크거나 같고, 1.0보다 작은 임의의 실수를 리턴
		// ( 0.xxx ~0.999 ) * 45 			: 0.xxx ~ 44.xxx
		// (( 0.xxx ~0.999 ) * 45) + 1		: 1.xxx ~ 45.xxx
		// (Math.random() * 45) + 1			: 1.xxx ~ 45.xxx
		// (int) ((Math.random() * 45) + 1) : 1 ~ 45
		// 공식 - a ~ b 사이의 랜덤수
		// (int) ((Math.random() * [개수] + [시작숫자]))
		System.out.println("이번주 행운의 번호는");
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45 + 1);
			System.out.print( random + " ");
		}
		System.out.println();
		
		// -20 ~ + 20 랜덤수 하나
		// 0.xxx ~ 40.xxx
		// -20.xxx ~ 20.xxx
		// -20  ~ 20
		int random = (int) (Math.random() * 41 + (-20));
		System.out.println("(-20 ~ +20)" + random);

		// Random이라는 클래스도 있음
		Random r = new Random();
		// 0 ~ N 사이의 랜덤 정수 가져와줌
		System.out.println(r.nextInt(100));
		// -50 ~50 사이의 랜덤 정수 가져와줌
		System.out.println(r.nextInt(100) -50);
		
	}
}
