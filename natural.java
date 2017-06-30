import java.io.*;
import java.util.*;
class natural
{
public static void main(String[] args)
{
int a,i=1,sum=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(i<=a)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
}
