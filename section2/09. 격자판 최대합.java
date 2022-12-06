import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Jiwon Lee
 * Array(1, 2차원 배열)
 * 9. 격자판 최대합
 * 
 */
public class Main {
	
	public int solution(int n, int[][] nArray) {
		int max = Integer.MIN_VALUE, tmp1 = 0, tmp2 = 0;
		
		for(int i = 0;i<n;i++){//가로 세로 측정
			for(int j = 0;j<n;j++) {
				tmp1 += nArray[i][j];
				tmp2 += nArray[j][i];
			}
			if(max<tmp1) max=tmp1; // max = Math.max(max, tmp1);
			if(max<tmp2) max=tmp2; // max = Math.max(max, tmp2);
			tmp1 = 0; tmp2 = 0;
		}
		
		for(int i =0;i<n;i++) {//대각선 측정
			tmp1+=nArray[i][i];
			tmp2+=nArray[n-1-i][i];
		}
		if(max<tmp1) max=tmp1; // max = Math.max(max, tmp1);
		if(max<tmp2) max=tmp2; // max = Math.max(max, tmp2);
		tmp1 = tmp2 = 0;
		
		return max;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] numArray = new int[num][num];
		
		for(int i =0;i<num;i++) {
			for(int j = 0;j<num;j++) {
				numArray[i][j] = sc.nextInt();
			}
		}
		
		System.out.print(T.solution(num, numArray));
		
		sc.close();
	}

}
