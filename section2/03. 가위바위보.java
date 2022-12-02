import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 3. 가위바위보
 * 
 */
public class Main {
	
	public char[] mySolution(int n, int[] arrayA, int[] arrayB) {
		char[] answer = new char[n];
		for(int i=0;i<n;i++) {
			if(arrayA[i]==arrayB[i]) {
				answer[i]='D';
			}else if(arrayA[i]>arrayB[i]){//A가 더 큰 경우
				if(arrayA[i]==3&&arrayB[i]==1) answer[i]='B';//예외
				else answer[i]='A';
			}else {//B가 더 큰 경우
				if(arrayA[i]==1&&arrayB[i]==3) answer[i]='A';//예외
				else answer[i]='B';
			}
		}
		return answer;
	}
	
	public String solution(int n, int[] a, int[] b) {
		String answer="";
		for(int i =0;i<n;i++) {
			if(a[i]==b[i]) answer+="D";
			else if(a[i]==1&&b[i]==3) answer+="A";
			else if(a[i]==2&&b[i]==1) answer+="A";
			else if(a[i]==3&&b[i]==2) answer+="A";
			else answer+="B";
		}
		return answer;
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arrayA = new int[num];
		int[] arrayB = new int[num];
		for(int i=0;i<arrayA.length;i++) {
			arrayA[i]=sc.nextInt();
		}
		for(int i=0;i<arrayB.length;i++) {
			arrayB[i]=sc.nextInt();
		}
		for(char x:T.mySolution(num, arrayA, arrayB)) {
			System.out.println(x);
		}
		sc.close();
	}

}
