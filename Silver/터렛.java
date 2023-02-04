import java.util.*;
import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class Main {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		float r=0;
		float x=0;
		float y=0;
		float xl = 0;
		float yl=0;
		float rl=0;
		
		while(num++<n) {
			
			x=sc.nextFloat();
			y=sc.nextFloat();
			r=sc.nextFloat();
			xl=sc.nextFloat();
			yl=sc.nextFloat();
			rl=sc.nextFloat();
			float d=(float) Math.sqrt(Math.pow(xl-x, 2)+Math.pow(yl-y, 2));
			
			if(Math.abs(rl+r)==d) {
				System.out.println(1);
			}
			else if(Math.abs(rl+r)<d) {
				System.out.println(0);
			}
			else if(Math.abs(r+rl)>d&&(Math.abs(r-rl)<d&&d!=0)) {
				System.out.println(2);
			}
			else if(Math.abs(r-rl)==d&&Math.abs(r-rl)!=0) {
				System.out.println(1);
			}
			else if (d==0) {
				if(rl==r) {
					System.out.println(-1);
				}
				else {
					System.out.println(0);
				}
				
			}
			else if(Math.abs(r-rl)>d&&d!=0) {
				System.out.println(0);
			}
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
	}
