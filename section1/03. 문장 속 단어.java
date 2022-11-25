import java.util.Scanner;

public class Main {
  
  public String solution(String str){
    String maxStr = "";
    /*
    String[] splitStr = str.split(" ");
    
    for(String s:splitStr){
      if(s.length()>maxStr.length()) maxStr=s;
    }
    */

    int m = Integer.MIN_VALUE, pos;
    while((pos = str.indexof(' ') )!=-1){
      String tmp = str.substring(0,pos);
      int len = tmp.length();
      if(len>m){
        m=len;
        answer=tmp;
      }
      str=str.substring(pos+1);
    }
    if(str.length()>m) answer=str;
    return maxStr;
  }

  public static void main(String[] args){
    Main T = new Main();

    Scanner in=new Scanner(System.in);
    String str = in.nextLine();

    System.out.println(T.solution(str));
    return ;
  }
}
