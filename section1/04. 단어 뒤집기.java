import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer="";
		
		for(int i=str.length()-1;i>=0;i--) {
			answer+=str.charAt(i);
		}
		
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
