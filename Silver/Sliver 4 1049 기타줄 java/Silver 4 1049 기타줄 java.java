import java.util.Arrays;

import java.util.StringTokenizer;


	

	
import java.io.*;
import java.util.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args)throws IOException {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int suml=0;
	int sume=0;
	int N=sc.nextInt();
	int Nl=N;
	int Ne=N;
	int M=sc.nextInt();
	int [] packeage=new int [M];
	int [] each=new int [M];
	
	
	for(int i=0;i<M;i++) {
		packeage[i]=sc.nextInt();
		each[i]=sc.nextInt();
		
		
		
		
	}
	
	Arrays.sort(packeage);
	
	Arrays.sort(each);
	
	
	while(N!=0) {
		
		if(N>=6) {
			sum+=packeage[0];
			N-=6;
		}
		
		else {
			
			sum+=each[0];
			N-=1;
		}
	
	
	
	
	}
	
	
while(Nl>0) {
		
		
			suml+=packeage[0];
			Nl-=6;
	
}
	
while(Ne>0) {
	
	
	sume+=each[0];
	Ne-=1;

}



	
	
	
	System.out.println(Math.min(Math.min(sum, suml),sume));
	}
	
	



}
