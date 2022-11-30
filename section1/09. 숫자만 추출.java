import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 9. 숫자만 추출
 * 
 */
public class Main {
	
	public int mySolution(String str) {
		int answer = 0;
		String numStr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') numStr+=str.charAt(i); // Character.isDigit(c)
		}
		answer = Integer.parseInt(numStr);
		
		return answer;
	}
	
	public int solution(String str) {
		int answer = 0;

		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10 + (x-48) ;
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

