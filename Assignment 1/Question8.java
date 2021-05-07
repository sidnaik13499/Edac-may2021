class Question8
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++){
			for(int j=1;j<=25;j++){
				
				if(i==1 & j==4 | i==2 & j==4 | i==3 & j==1 |i==3 & j==4 |i==4 &j==2 |i==4 &j==3 ){
					System.out.print("J");
				}else if(i==1 & j==8 | i==2 & j==7 |i==2 & j==9 |i==3 & j==6 |i==3 & j==7 |i==3 & j==8 |i==3 & j==9 | i==3 & j==10 |i==4 & j==5 |i==4 & j==11){
					System.out.print("a");
				}else if(i==1 & j==12 |i==1 & j==18 |i==2 & j==13 |i==2 & j==17 |i==3 & j==14 |i==3 & j==16 |i==4 & j==15){
					System.out.print("v");
				}else if(i==1 & j==22 | i==2 & j==21 |i==2 & j==23 |i==3 & j==20 |i==3 & j==21|i==3 & j==22 |i==3 & j==23 | i==3 & j==24 |i==4 & j==19 |i==4 & j==25){
					System.out.print("a");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}

				
  
  
  
  