import java.util.*;
import java.lang.*;
import java.io.*;
public class Ap
{
	public static void main (String[] args) 
	{
		int a,d,n,r;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
d=sc.nextInt();
n=sc.nextInt();
r=((n / 2) * (2 * a + (n - 1) * d));
System.out.println(r);
	}
}
