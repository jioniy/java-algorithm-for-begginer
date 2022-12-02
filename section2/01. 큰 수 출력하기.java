import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 1. 큰 수 출력하기
 * 
 */
public class Main {
	
	public ArrayList<Integer> solution(int n, int[] array) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(i==0) answer.add(array[i]);
			else if(array[i-1]<array[i]) {
				answer.add(array[i]);
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int x:T.solution(num, array)) {
			System.out.print(x+" ");
		}
		sc.close();
	}

}
