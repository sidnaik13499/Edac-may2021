class PatternA10
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--){
			for(int j=i-1;j>=1;j--){
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++){
				System.out.print((char)(k+64)+" ");
			}
			System.out.println();
		}
	}
}