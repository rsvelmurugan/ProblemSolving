class GCD{
	public static void main(String[] args) {
		int x=20,y=15,gcd=1;
		for(int i=1;i<=x&&i<=y;i++){
			if(x%i==0&&y%i==0)
				gcd=i;
		}
				System.out.printf("GCD of %d and %d is :%d ",x,y,gcd);
			}
		}
/*
output:

GCD of 20 and 15 is :5
*/
	
