class Factorial{
	public static void main(String[] args) {
		int n=5;
		int sum=1;
		while(n>0){
			sum=sum*n;
			n--;
		}
		System.out.println(sum);
	}
}
/*
output:
120
*/