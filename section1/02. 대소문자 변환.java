import java.util.Scanner;

public class Main {
  public String solution(String str){
    String answer = "";

    /* ASCII 방식
    char target;
    for(int i=0;i<str.length();i++){
      target = str.charAt(i);
      if(target>=65 && target<=90){
        answer+=Character.toLowerCase(target);
      }else{
        answer+=Character.toUpperCase(target);
      }
    }*/
    
    for(char x : str.toCharArray()){
      if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
      else answer+=Character.toLowerCase(x);
    }

    return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();

    System.out.println(T.solution(str));
    
  }
}
