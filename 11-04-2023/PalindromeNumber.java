class PalindromeNumber{
	public static void main(String[] args) {
		int a,b=0,c;
		int n=1771;
		c=n;
		while(n>0){
			a=n%10;
			b=(b*10)+a;
			n=n/10;
		} if(c==b){
			System.out.println("It is a PalindromeNumber");
		}else{
			System.out.println("It is not a PalindromeNumber");
		}
	}
}
/*
output:
It is a PalindromeNumber
*/