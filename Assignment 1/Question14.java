class Question14
{
	public static void main(String args[])
  {
		for(int i=1;i<=9;i++){
		  for(int j=1;j<=45;j++){
			if((i%2==1 & j%2==1 | i%2==0 & j%2==0) & j<=11){
				System.out.print("*");
			}else if((i%2==0 & j%2==1 | i%2==1 & j%2==0)&j<=11){
				System.out.print(" ");
			}else{
				System.out.print("=");
			}
	      } 
		  System.out.println();
        }
		for(int i=1;i<=6;i++){
		  for(int j=1;j<=45;j++){
			System.out.print("=");
		  }	 
		  System.out.println();
	   }
}  
}
	