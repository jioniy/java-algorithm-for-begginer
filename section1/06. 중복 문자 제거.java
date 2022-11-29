import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 6. 중복 문자 제거
 * String에서 특정 문자의 인덱스 번호와 첫 인덱스 번호가 같지 않으면 중복된 문자
 */
public class Main {
	public String solution(String str) {
		String answer="";
		
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		}
		
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
