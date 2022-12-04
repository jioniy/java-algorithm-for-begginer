import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 6. 뒤집은 소수
 * 
 */
public class Main {
	
	public ArrayList<Integer> solution(int n, String arrStr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		String[] arr = arrStr.split("\\s");
		for(int i =0;i<n;i++) {
			int tmp = Integer.parseInt(new StringBuilder(arr[i]).reverse().toString());
			for(int j = 2;j<tmp;j++) {
				if(tmp%j==0) {
					tmp = 0;
					break;
				}
			}
			if(tmp != 0 && tmp!=1) answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String arrStr = sc.nextLine();
		
		for(int x: T.solution(num, arrStr)) {
			System.out.print(x+" ");
		}
		
		sc.close();
	}

}
