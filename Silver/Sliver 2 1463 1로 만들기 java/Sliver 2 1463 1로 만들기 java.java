import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []dp=new int[1000001];
		
		dp[0]=0;
		dp[1]=0;
		
		int i=2;
		
		while(i<=n){
		    
		        
		        dp[i]=dp[i-1]+1;
		        
		        if(i%2==0){
		            dp[i]=Math.min(dp[i],dp[i/2]+1);
		            
		        }
		         if(i%3==0){
		            dp[i]=Math.min(dp[i],dp[i/3]+1);
		            
		        }
		       
		        
		        
		        
		        
		    
		    
		   
		
		
		i++;
	
		
		
		
		
	}
	
	System.out.println(dp[n]);
}
}
