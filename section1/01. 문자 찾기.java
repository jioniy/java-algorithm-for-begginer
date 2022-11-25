import java.util.Scanner;
  
public class Main {
  public int solution(String str, char t){
    str=str.toUpperCase();
    a = Character.toUpperCase(a);

    int count =0;
    /*
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) == a){
        count++;
      }
    }*/
    for(char x : str.toCharArray()){
      if(x==t) answer++;
    }
    return count;
  }

  public static void main(String[] args){
    Main T = new Main();

    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    char a = in.next().charAt(0);
    
    System.out.println(T.solution(str,c));
  }
}