import java.util.Scanner;
/**
 * 10. 문자 거리 
 * 해당 문자 c가 나타날 때 0부터 시작해서 거리 count
 * 왼쪽으로 시작해서 한 번, 오른쪽 끝에서 시작해서 한 번, 총 두 번 for 문을 돌아 거리 배열 완성
 */
public class Main {
	
	public int[] solution(String s, char c) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=answer.length-1;i>=0;i--) {
			if(answer[i]==0) p=0;
			else {
				p++;
				//if(p<answer[i]) answer[i]=p;
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		int[] answer = T.solution(str, c);
		for(int i : answer) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
