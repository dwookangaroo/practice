import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problem01();
		//problem02();
		//problem03();
		//problem04();
		//problem05();
	}
	
	public static void problem01() {
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int three = 0;
		int sum = 0;
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] % 3 == 0) {
				three++;
				sum += data[i];
			}
		}
		
		
		
		System.out.println("주어진 배열에서 3의 배수의 개수 =>" + three);
		System.out.println("주어진 배열에서 3의 배수의 합 =>" + sum);
	}
	
	public static void problem02() {
		int[] ar = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		float total = 0;
		
		for (int i = 0; i < ar.length; i++) {
			int num = scanner.nextInt();
			total += num;
		}
		
		System.out.println("평균은 " + (total/5) + " 입니다." );
		
		
		
	}
	
	public static void problem03() {
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
		
		System.out.println(c);
		
	}
	public static void problem04() {
		int ar [] = new int [6];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int)(Math.random()*45)+1 ;
			
			
			
			
		}
		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void problem05() {
		int scoreboard[][] = {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}
		}; 
		int total = 0;
		int count = 0;
		
		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard.length; j++) {
				
				if(scoreboard[i][j] >= 85) {
					total += scoreboard[i][j];
					count++;
				}
			}
		}
		float avg = total/count;
		System.out.println("총합 " + "= " + total);
		System.out.println("평균값 " + "= " + avg);
	}

	
	
	
	
	
	
	
	
	
	
	
}
