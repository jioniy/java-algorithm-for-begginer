import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    str=str.toUpperCase();
    char a = in.next().charAt(0);
    a = Character.toUpperCase(a);
    int count =0;
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) == a){
        count++;
      }
    }
    System.out.println(count);
  }
}