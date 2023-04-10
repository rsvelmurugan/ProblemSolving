class Factors1{
	public static void main(String[] args) {
		int num=45;
		for(int i=1;i<num;i++){
			if(num%i==0){
				System.out.println(i+" ");
			}
		}
	}
}
/*
output:
1
3
5
9
15
*/