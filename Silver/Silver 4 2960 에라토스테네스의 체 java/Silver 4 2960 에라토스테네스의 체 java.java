import java.util.Arrays;

import java.util.StringTokenizer;


	

	
import java.io.*;
import java.util.*;
import java.util.Queue;
public class Main {

	public static void main(String[] args)throws IOException {
	Queue<Integer> qu=new LinkedList();
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	String []spt =s.split(" ");
	
	
	int N=Integer.parseInt(spt[0]);
	int K=Integer.parseInt(spt[1]);
	for(int i=2;i<=N;i++) {
		
		qu.add(i);
		
	}
	int sum=0;
	int t=0;
l:while(!qu.isEmpty()) {
	int num=qu.size();
	int peek=qu.peek();
	for(int i=0;i<num;i++) {
		if(qu.peek()%peek==0) {
			sum++;
			t=qu.peek();
			qu.remove();
			if(sum==K) {
				
				break l;
			}
			
			
		}
		else {
			qu.add(qu.remove());
		}
		
		
	}
	
			
	
	
	
}
	
	
	System.out.println(t);
	

}


}
