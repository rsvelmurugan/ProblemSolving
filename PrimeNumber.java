import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x=sc.nextInt();
		if(x==0 ||x==1){
			System.out.println("Its a Not PrimeNumber");
		}else{
			for(int i=2;i<x;i++){
				if(x%i==0){
					System.out.println("Its not a primeNumber");
					System.exit(0);
				}
			}
				System.out.println("Its a primeNumber");
			}
		}

	}

/*
	output:
	Enter the Number:
9
Its not a primeNumber
*/