import java.util.Scanner;

public class Main {
	public String solution(String str) {
		/* 방법 1. StringBuilder 이용
		String answer = new StringBuilder(str).reverse().toString();
		*/
		/* 방법 2. 문자 교체 방식*/
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt<rt){
			char tmp = s[lt];
			s[lt]=s[rt];
			s[rt]=tmp;
			lt++;
			rt--;
		}
		String answer = String.valueOf(s);

		/* 내 방법
		String answer="";
		
		for(int i=str.length()-1;i>=0;i--) {
			answer+=str.charAt(i);
		}
		*/
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String str = sc.nextLine();
			System.out.println(T.solution(str));
		}
		
		sc.close();
	}

}
