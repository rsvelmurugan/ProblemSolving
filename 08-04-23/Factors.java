import java.util.Scanner;
class Factors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		for(int i=1;i<num;i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}
/*
output:
Enter the Number:
45
1
3
5
9
15
*/