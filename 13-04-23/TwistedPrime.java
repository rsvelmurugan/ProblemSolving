import java.io.*;
import java.util.*;
class TwistedPrime{
	static int reverse(int n){
		int a=0;
	while(n!=0){
		int b=n%2;
		a=(a*10)+b;
		n=n/2;
	}
	return a;
	}
	static boolean prime(int n){
		if(n==0||n==1){
			return false;
		}else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					return false;
				}
				return true;
			}
		}
		return false;
	}
	static boolean checknumber(int n){
		if(prime(n)&&prime(reverse(n)))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(checknumber(n))
			System.out.println(n+" Is a twised Number");
		else
			System.out.println(n+"Is not a twisted Number");
	}
	}
/*
output:
Enter the number:
12
12Is not a twisted Number
Enter the number:
43
43 Is a twised Number
*/

	
