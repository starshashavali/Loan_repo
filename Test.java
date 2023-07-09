import java.util.Scanner;
class Test{
public static void printNumRevOrder(int num){
while(num!=0){
System.out.print(num%10);
num=num/10;
}
}



public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
printNumRevOrder(num);
}
}

//logical Programming