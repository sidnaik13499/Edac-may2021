class Pyr6
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++){
			for(int j=5;j>=i;j--){
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++){
				if(i==3&&k==2 || i==4&&k==2 || i==4&&k==3 || i==5&&k==2 || i==5&&k==3 ||i==5&&k==4  ){
					System.out.print("    ");
				}else{
				  System.out.print(" *  ");
				}
			}
			System.out.println();
		}
	}
}