import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 5. 소수 (에라토스테네스 체)
 * 
 */
public class Main {
	
	public int solution(int n) {
		int answer = 0;
		int[] eratos = new int[n+1];
		
		for(int i = 2 ; i<=n ; i++) {
			if(eratos[i]==0) {
				answer++;
				for(int j=i;j<=n;j=j+i) {
					eratos[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(T.solution(num));
		
		
	}

}