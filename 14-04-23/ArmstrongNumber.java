import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumber{
	static boolean Armstrong(int n){
		int temp,last=0,digits=0,sum=0;
		temp=n;
		while(temp>0){
			temp=temp/10;
			digits++;
		}
		temp=n;
		while (temp>0) {
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;
		else
			return false;
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		System.out.println(" ArmstrongNumber up to" +n+" are:");
		for(int i=0;i<=n;i++){
			if(Armstrong(i))
				System.out.println(i+" ");
		}
	}
}
/*
output:
153
 ArmstrongNumber up to153 are:
0
1
2
3
4
5
6
7
8
9
153
*/