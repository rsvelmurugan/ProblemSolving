class OneSideTriangular1{
	public static void main(String[] args)throws Exception {
		for(int i=1;i<6;i++){
			for(int j=1;j<6;j++){
				if(i==1&j==1||i==2&j==1||i==2&j==2||i==3&j==1||i==3&j==2||i==3&j==3||i==4&j==1||i==4&j==2||i==4&j==3||i==4&j==4||i==5&j==1||i==5&j==2||i==5&j==3||i==5&j==4||i==5&j==5){
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
*
**
***
****
*****
*/