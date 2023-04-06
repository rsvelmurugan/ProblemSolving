class FibonacciSeries{
	public static void main(String[] args) {
		int n=0,n1=1,n2;
		int count=10;
		System.out.print(n+" "+n1);
		for(int i=2;i<count;++i){
			n2=n+n1;
			System.out.print(" "+n2);
              n=n1;
			  n1=n2;
		}
		
	}
}
/*
ouput:
0 1 1 2 3 5 8 13 21 34
*/  