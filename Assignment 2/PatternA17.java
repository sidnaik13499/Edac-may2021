import java.util.Scanner;
class PatternA17

{
	public static void main(String args[])
	{
		int dec1=0, rem1,rem2, i=1,j=1,dec2=0, dec3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number:");
		int a =sc.nextInt();  
		int b =sc.nextInt();  
		
		while(a!=0)      
		{
			rem1 = a%10;
			dec1 = dec1 + (rem1 * i);  
			i = i * 2;   
			a = a/10;   
			
			
		}
		System.out.println("decimal no."+dec1);
		while(b!=0)      
		{
			rem2 = b%10;  
			dec2 = dec2 + (rem2 * j); 
			j = j * 2; 
			b = b/10; 
			
			
		}
		System.out.println("decimal no."+dec2);
		
		dec3= dec1+dec2;      
				
		int bin=0, rem, k=1;
		
		while(dec3!=0)          
		{
			rem = dec3%2;   
			dec3 = dec3/2;   
			bin = bin + rem*k;   
			k=k*10;  //10, 100
			
		}
		System.out.println("binary no."+bin);
	
		
	}

}
