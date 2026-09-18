package ch02.variable;

public class PrintFormat {

	public static void main(String[] args) {
		
		String str1 = "Test";
		String str2 = "format";
		int intVal = 12;
		double doubleVal = 4.5;
		char charVal = 'A';
		
		System.out.println(str1 + "를 " +  intVal +"점 맞아서 " + doubleVal + " " + charVal + "못받음");
		System.out.printf("%s를 %d점 맞아서 %.1f %c 봇받음이 %s됨", str1, intVal, doubleVal, charVal, str2);
		

	}

}
