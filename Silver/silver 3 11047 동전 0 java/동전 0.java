import java.util.*;
public class Main {

	public static void main(String[] args) {
		int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
int sum=0;
	int N=sc.nextInt();
	long b=sc.nextLong();
	for(int i=0;i<N;i++) {
		
		int in=sc.nextInt();
		arr[i]=in;
		
		
		
	}
	for(int i=N;i>0;i--) {
		
		if(b/arr[i-1]!=0) {
			
			sum+=(b/arr[i-1]);
			b%=arr[i-1];
			
		}
		
		
		
		
		
		
	}
	
	

	
	System.out.println(sum);
	
	
	
	}

}
