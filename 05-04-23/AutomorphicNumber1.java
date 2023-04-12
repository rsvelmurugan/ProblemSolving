class AutomorphicNumber1{
	static boolean method(int num){
		int Square=num*num;
		while(num>0){
			if(num%10!=Square%10)
		return false;

			num=num/10;
			Square=Square/10;
		}
		return true;
	} 
	public static void main(String[] args) {
		System.out.println(method(70)?"Yes":"No");
	}
	}
	/*
	output:
	No
	*/