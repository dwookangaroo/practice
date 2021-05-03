import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//program();
		program1();
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
	}
	
	
}