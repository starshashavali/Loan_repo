
import java.util.Scanner;
public class Test1{
public static void revString(String str){

for(int i=str.length()-1;i>=0;i--){
System.out.print(str.charAt(i));
}
}
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
String str=sc.nextLine();
revString(str);
}}