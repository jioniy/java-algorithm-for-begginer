import java.util.Scanner;
/**
 * @author Jiwon Lee
 * 12. 암호
 * 
 */
public class Main {
	
	public String mySolution(int num, String s) {
		String answer = "";
		char tmp;
		s=s.replaceAll("\\#", "1");
		s=s.replaceAll("\\*", "0");

		for(int i =0;i<num;i++) 
			answer+=(char)Integer.parseInt(s.substring(0+i*7, 7+i*7),2);
		
		return answer;
	}
	
	public String solution(int num, String s) {
		String answer = "";
		for(int i=0;i<num;i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
			int n = Integer.parseInt(tmp, 2);
			answer+=(char)n;
			s=s.substring(7);
		}
		return answer;
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		
		System.out.print(T.solution(num, str));
		
		sc.close();
	}
	
	/*
	 * * replace와 replaceAll의 차이 * *
	 * 
	 * String str = "aaabbbccccabcddddabcdeeee";
  
		  String result1 = str.replace("abc", "왕");
		  String result2 = str.replaceAll("[abc]", "왕");
		  
		  System.out.println(result1); //aaabbbcccc왕dddd왕deeee
		  System.out.println(result2); //왕왕왕왕왕왕왕왕왕왕왕왕왕dddd왕왕왕deeee
	 * 
	 */

}

