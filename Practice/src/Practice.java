import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//quiz01();
		//quiz02();
		//quiz03();
		//quiz04();
		//problem01();
		//problem02();
		//problem03();
		//problem04();
		//problem05(); //!!!!!
		//problem06();
		//problem07(); !!!!!
		//problem08();
	}
	private static void quiz01(){
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
	
	private static void quiz02() {
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
	
	private static void quiz03() {
		//2단부터 9단까지
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	private static void quiz04() {
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	private static void problem01() {
			
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static void problem02() {
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
	
	private static void problem03() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}System.out.println();
		}
	}
	
	private static void problem04() {
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+j + "\t");
			}System.out.println();
		}
	}
	/*
	private static void problem05() {
		Scanner scanner = new Scanner(System.in);
		int ar [] = new int[5];
		
		System.out.println("숫자를 입력하세요");
		
		for (int i = 0; i < 5; i++) {	//숫자5개를 배열로생성
			System.out.print("숫자: ");
			ar[i] = scanner.nextInt();			
		}
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {
					int = ar[i];
				}else if(ar[i]<ar[j]) {
					int 
				}
			}
		}
		
		
		
		
		System.out.println("최대값은 " +  "입니다.");
		
	}
	*/

	private static void problem06() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int total = 0;
		int num1 = 0;
		int num2 = 0;
		int total2 = 0;
			if(num % 2 == 0 ) {
				for (int i = 2; i <= (num/2); i++) {
					
					num1 = 2*i;
					total += num1;			
					
				}
				
				System.out.println("결과값: " + (total + 2)  );
			} else {
				for (int i = 0; i < (num/2)+1; i++) {
					
					num2 = (2*i) + 1;
					total2 += num2;
				}
				System.out.println("결과값: "+ total2);
				
			}	
			scanner.close();
	}

	public static void problem07() {
		
		Scanner scanner = new Scanner(System.in);
		int rannum = (int)(Math.random()*100)+1;
		
		System.out.println(rannum);
		
		while(true) {
			System.out.println("=================");
			System.out.println("[숫자맞추기게임 시작");
			System.out.println("=================");
			System.out.print(">>");
			
			int num = scanner.nextInt();
			
			//틀렷을떄
			while(rannum != num) { 
				
				if(rannum > num) {
					System.out.println("더 높게");
					System.out.print(">>");
					
					
				}else {
					System.out.println("더 낮게");
					System.out.println(">>");
					
				}
			}
			
			//맞추면
			if(rannum == num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하겟습니까?(y/n) >>");
				String s = scanner.next();
				
				if(s=="y") {
					continue;
				} else {
					break;
				}
			}
			
		}		
		
	}
	public static void problem08() {
		Scanner scanner = new Scanner(System.in);
		int leftmon = 0;
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = scanner.nextInt();
			
				if(num == 1) {
					System.out.print("예금액>");
					int addmon = scanner.nextInt();
					leftmon += addmon;
				}else if(num == 2) {
					System.out.print("출금액>");
					int minmon = scanner.nextInt();
					leftmon -= minmon;
				}else if(num == 3) {
					System.out.print("잔고액>" + leftmon);
					System.out.println();
					
				}else if(num == 4){
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("다시입력해주세요.");
				}
			
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}