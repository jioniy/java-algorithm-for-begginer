import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 8. 유효한 팰린드롬
 * mySolution - 반복문으로 알파벳 문자만 추출 후 회문 검사(String)
 * solution - 
 * 
 */
public class Main {
	
	public String mySolution(String str) {
		String answer = "NO";
		String strA = "";
		String tmpA = "";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)))strA+=str.charAt(i);
		}
		tmpA = new StringBuilder(strA).reverse().toString();
		if(tmpA.equalsIgnoreCase(strA)) answer="YES";
		
		return answer;
	}
	
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");//A-Z문자가 아니면 빈 문자 처리
		String tmp = new StringBuilder(s).reverse().toString();
		if(tmp.equals(s)) answer="YES";
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
