import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Jiwon Lee
 * Two Pointers, Sliding window
 * 1. 두 배열 합치기
 * solution - two pointers 알고리즘 사용
 */
public class Main {
	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;

		while(p1<n&&p2<m) {
			if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		while(p1<n)answer.add(arr1[p1++]);
		while(p2<m)answer.add(arr2[p2++]);

		return answer;
	}

	public int[] mySolution(int n, int[] arr1, int m, int[] arr2) {
		int[] answer = new int[n+m];

		for(int i=0;i<n;i++) {
			answer[i]=arr1[i];
		}
		for(int j =0;j<m;j++) {
			answer[n+j]=arr2[j];
		}

		Arrays.sort(answer);

		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i =0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] arr2 = new int[m];

		for(int i =0;i<m;i++) {
			arr2[i] = sc.nextInt();
		}

		for(int x : T.solution(n, arr1, m, arr2)) {
			System.out.print(x+" ");
		}
	}

}
