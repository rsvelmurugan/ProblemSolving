class SquarePattern1{
	public static void main(String[] args)throws Exception {
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1&j==1||i==1&j==3||i==1&j==5||i==1&j==7||i==2&j==1||i==2&j==7||i==3&j==1||i==3&j==7||i==4&j==1||i==4&j==3||i==4&j==5||i==4&j==7){
					Thread.sleep(100);
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
/*
output:
* * * *
*     *
*     *
* * * *
*/