package ch02.variable;

public class VariableExample {

	public static void main(String[] args) {
		int price = 2000;
		int sale = 1500;
		
		System.out.print("도넛 가격 : " + price + "\n");
		
		price = sale;
		
		System.out.print("세일 가격 : " + price);
		
		
	}
	
}