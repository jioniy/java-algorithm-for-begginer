import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 7. 점수 계산
 * 
 */
public class Main {
	
	public int solution(int n, int[] nArray) {
		int answer = 0;
		int plus = 0;
		
		for(int i = 0;i<n;i++) {
			if(nArray[i]==1) {
				plus++;
				answer = answer+plus;
			}else {
				plus = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numArray = new int[num];
		for(int i =0;i<num;i++) {
			numArray[i] = sc.nextInt();
		}
		
		System.out.print(T.solution(num, numArray));
		
		sc.close();
	}

}
