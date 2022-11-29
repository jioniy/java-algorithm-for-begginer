import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 7. 회문 문자열
 * 1) lt와 rt를 양끝 인덱스로 두고, 1씩 줄여가면서 같은지 확인
 * 2) str의 길이의 1/2 만큼 반복문을 돌면서 검사
 * 3) String Builder로 문자열을 뒤집고 그 문자열과 같은지 검사
 */
public class Main {
	public String mySolution(String str) {
		str=str.toLowerCase();
		int lt=0, rt=str.length()-1;
		
		while(lt<rt) {
			if(str.charAt(lt)!=str.charAt(rt)) return "NO";
			lt++;
			rt--;
		}
		return "YES";
	}
	
	public String solution(String str) {
		String answer = "YES";
		str=str.toUpperCase();
		int len = str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();//문자열 뒤집기
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
		sc.close();
	}

}
