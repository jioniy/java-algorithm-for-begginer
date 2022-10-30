import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    String[] splitStr = str.split(" ");
    String maxStr = "";
    for(String s:splitStr){
      if(s.length()>maxStr.length()) maxStr=s;
    }
    System.out.println(maxStr);
    return ;
  }
}
