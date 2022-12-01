import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 11. 문자열 압축
 * 
 */
public class Main {
	
	public String mySolution(String s) {
		String answer="";
		char ch='-';
		int count = 1;
		for(char c : s.toCharArray()) {
			if(c!=ch) {
				if(count != 1) answer+=count;
				ch = c;
				count=1;
				answer += c;
			}
			else{
				count++;
			}
		}
		if(count != 1) answer+=count;
		return answer;
	}
	
	public String solution(String s) {
		String answer = "";
		s=s+" ";
		int cnt=1;
		for(int i =0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1))cnt++;
			else {
				answer+=s.charAt(i);
				if(cnt>1)answer+=String.valueOf(cnt); 
				cnt=1;
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		String str = sc.next();
		
		System.out.print(T.solution(str));
		
		sc.close();
	}

}
