import java.util.Scanner;

class Solution{
  public String solution(String str){
    String answer = "";
    char target;
    for(int i=0;i<str.length();i++){
      target = str.charAt(i);
      if(target>=65 && target<=90){
        answer+=Character.toLowerCase(target);
      }else{
        answer+=Character.toUpperCase(target);
      }
    }
    return answer;
  }
}
public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    Solution solution = new Solution();
    System.out.println(solution.solution(str));
    
  }
}
