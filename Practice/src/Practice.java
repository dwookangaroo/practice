import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//program();
		//program1();
		//program2();
		//program3();
		//practice01();
		//practice02();
		//practice03();
		//practice04();
		//practice05(); !!!!!
		practice06();
		//hi();
	}
	private static void program(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scanner.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println(num + "은 3의 배수가 아닙니다.");
		}
		scanner.close(); 
	}
	
	private static void program1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("A등급");
		}else if(score >= 80) {
			System.out.println("B등급");
		}else if(score >= 70) {
			System.out.println("C등급");
		}else if(score >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		scanner.close();
	}
	
	private static void program2() {
		//2단부터 9단까지
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	private static void program3() {
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	private static void practice01() {
			
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static void practice02() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}System.out.println();
		}	
		scanner.close();
	}
	
	private static void practice03() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}System.out.println();
		}
	}
	
	private static void practice04() {
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+j + "\t");
			}System.out.println();
		}
	}
	
	private static void practice05() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int num = scanner.nextInt();			
		}
		System.out.println("최대값은 " +   " 입니다." );
		System.out.println();
		
		
	}

	private static void practice06() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int total = 0;
		int num1 = 0;
		
		
			if(num % 2 == 0 ) {
				for (int i = 2; i < (num/2); i++) {
					
						
						num1 = num + 2;
						total += num1;						
					
				}
				
				
				System.out.println("결과값: " + total  );
			}
			
			
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}