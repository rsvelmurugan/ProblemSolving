import java.util.Scanner;
class HCF{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int x=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int y=sc.nextInt();
		int hcf=0;
		for(int i=1;i<=x||i<=y;i++){
			if(x%i==0&&y%i==0)
				hcf=i;
		}
		System.out.println("HCF of Number ::"+hcf);
	}
}
/*
output:
Enter the First Number:
200
Enter the Second Number:
100
HCF of Number ::100
*/