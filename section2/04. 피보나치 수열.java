import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 4. 피보나치 수열
 * 
 */
public class Main {
	public int[] mySolution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		for(int i =0;i<n;i++) {
			if(i-1>=0) answer[i] += answer[i-1];
			if(i-2>=0)answer[i] += answer[i-2];
		}
		
		/*
		*
		answer[0] = 1;
		answer[1] = 1;
		for(int i = 2 ; i < n ; i++ ) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		 * */
		
		return answer;
	}
	
	public void solution(int n) {//반환값 없이 직접 출력하는 경우
		int a = 1, b = 1, c;
		System.out.print(a+" "+b+" ");
		for(int i =2;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i : T.mySolution(num)) {
			System.out.print(i+" ");
		}
		
		
	}

}
