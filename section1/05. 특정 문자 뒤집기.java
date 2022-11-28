import java.util.Scanner;

/**
 * String(문자열)
 * 5. 특정 문자 뒤집기
 * */
public class Main {

	public String solution(String str) {
		/* 방법 1. */
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt<rt){
			if (!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else{
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);

		return answer;
		/* 내 방법
		char[] answer=str.toCharArray();
		String alphastr="";

		for(char c:answer) {
			if(Character.isAlphabetic(c)) alphastr+=c;
		}

		for(int i=0;i<answer.length;i++) {
			if(Character.isAlphabetic(answer[i])) {
				answer[i]=alphastr.charAt(alphastr.length()-1);
				alphastr=alphastr.substring(0, alphastr.length()-1);
			}
		}
		
		return new String(answer);
		*/
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		sc.close();
	}

}
