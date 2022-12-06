import java.util.Scanner;


/**
 * @author Jiwon Lee
 *
 * 8. 등수 구하기
 *
 */
public class Main {
	public int[] mySolution(int n, int[] arr) {
		int[] answer = new int[n];

		for(int i=0;i<n;i++) {
			answer[i]+=1;
			for(int j =0;j<n;j++) {
				if(i==j) {
					continue;
				}else if(arr[i]>arr[j]) {
					answer[j]++;
				}else if(arr[i]==arr[j]) {
					for(int k = 0;k <n;k++) {
						if(k!=i&&k!=j&&arr[k]>arr[i]) {
							arr[k]++;
						}
					}
				}
			}
		}


		return answer;
	}
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i =0;i<n;i++) {
			int cnt = 1;
			for(int j =0;j<n;j++) {
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}
