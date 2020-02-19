import java.util.Scanner;
public class Even{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a value:");
int d=s.nextInt();
String temp=(d%2==0)?"even":"odd";
System.out.println("value is" +temp);
}
}