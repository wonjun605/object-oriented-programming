package ch02.variable;


import java.util.Scanner;

public class Lab_Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력해 주세요: ");
		double val1 = s.nextDouble();
		System.out.print("첫 번째 숫자를 입력해 주세요: ");
		double val2 = s.nextDouble();
		
		double sum = val1 + val2;
		double diff = val1 - val2;
		double mul = val1 * val2;
		double quot = val1 / val2;
		
		System.out.println("덧셈 결과: " + (int) sum);
		System.out.println("뺄셈 결과: " + (int) diff);
		System.out.println("곱셈 결과: " + (int) mul);
		System.out.println("나눗셈 결과: " + (int) quot);
		
		s.close();

	}

}
