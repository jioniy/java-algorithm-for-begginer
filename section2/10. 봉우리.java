import java.util.Scanner;


/**
 * @author Jiwon Lee
 *
 * 10. 봉우리
 *
 */
public class Main {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int mySolution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i=1;i<n+2;i++) {
			for(int j = 1;j < n+2 ; j++) {
				if(arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i+1][j]&&arr[i][j]>arr[i][j+1]) answer++;
			}
		}
		
		return answer;
	}
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				boolean flag = true;
				for(int k = 0;k<4;k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/* for mySolution
		int[][] arr = new int[n+2][n+2];
		for(int i =0;i<n+2;i++) {
			for(int j = 0;j <n+2;j++) {
				if(i==0||j==0||i==n+1||j==n+1) arr[i][j]=0;
				else arr[i][j] = sc.nextInt();
			}
		}*/
		
		int[][] arr = new int[n][n];
		for(int i =0;i<n;i++) {
			for(int j = 0;j <n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n,arr));
	}

}
