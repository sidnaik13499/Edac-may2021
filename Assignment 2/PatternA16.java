class PatternA16
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++){
			for(int j=1,l=5;j<=i;j++,l--){
				System.out.print(l +" ");
			}
			System.out.println();
		}
	}
}