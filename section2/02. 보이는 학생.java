import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author JiwonLee
 * Array(1, 2차원 배열)
 * 2. 보이는 학생
 *
 */
public class Main {

	public int solution(int n, int[] array) {
		int answer = 1;
		int max = array[0];
		
		for(int i =1;i<n;i++) {
			if(max<array[i]) {
				answer++;
				max=array[i];
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
		
		System.out.print(T.solution(num, array));
		
		sc.close();

	}

}
