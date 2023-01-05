import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Jiwon Lee
 * Two Pointers, Sliding window
 * 2. 공통 원소 구하기
 * solution - two pointers algorithm
 */
public class Main {
	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) { // two pointers algorithm
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1=0,p2=0;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		while(p1<n&&p2<m) {
			if(arr1[p1]==arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}
			else if(arr1[p1]<arr2[p2]) p1++;
			else p2++;
		}


		return answer;
	}

	public ArrayList<Integer> mySolution(int n, int[] arr1, int m, int[] arr2) { // Time Limit Exceeded
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int j = 0;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i=0;i<n;i++) {
			while(j<m&&arr1[i]>=arr2[j]) {
				if(arr1[i]==arr2[j]) {
					answer.add(arr1[i]);
				}
				j++;
			}
			j=0;
		}

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
