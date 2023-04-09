import java.util.Scanner;
class AutomorphicNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int count=0;
		int Square=num*num;
		int temp=num;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		int lastDigit=(int)(Square%(Math.pow(10,count)));
		if(num==lastDigit){
			System.out.println("Is a AutomorphicNumber");
		}else{
			System.out.println("Is not a AutomorphicNumber");
		}
	}
}
/*
output:
Enter the Number
76
Is a AutomorphicNumber
Enter the Number
56
Is not a AutomorphicNumber
*/