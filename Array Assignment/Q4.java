/*	4. Write a program to find all pairs on an integer array whose sum
	is equal to a given number?
	Eg :
	Input : 1 2 4 5 3 6 3 7
	Output: 3, 3 and 4, 2
	6,1 and 4 , 3 */
	
public class Q4{
	public static void main(String args []){
		int arr [] = {1,2,4,5,3,6,3,7};
		int len = arr.length;
		int num = 7;
		for(int i=0; i<len;i++){
			for(int j=i+1; j<len;j++){
				if(arr[i]+arr[j] == num){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}