
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s= new Stack<Integer>();
		int n=sc.nextInt();
		int pivot=0;
		int p=2;
		StringBuffer sb=new StringBuffer();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
		int o=1;
		while(arr[0]>=o){
			s.push(o);
			sb.append("+");	
			o++;
		}
		pivot=s.size();
		if(!s.isEmpty()) {
					s.pop();
					}
		sb.append("-");	
for(int j=1;j<n;j++)	{
			if(pivot>arr[j]) {
				
				if(s.isEmpty()) {
					p++;
					break;	
				}
				while(!s.isEmpty()&&arr[j]!=s.peek()) {
					
					if(!s.isEmpty()) {
					s.pop();
					}
							sb.append("-");
					}
				if(!s.isEmpty()) {
					s.pop();
					}
				sb.append("-");
			}
			else if(pivot<arr[j]) {
				pivot++;
				while(arr[j]>=pivot) {
					s.push(pivot);
					sb.append("+");
					if(pivot==arr[j]) {
						break;
					}
					pivot++;
				}
				if(!s.isEmpty()) {
					s.pop();
					}
				sb.append("-");
			
			if(p==3) {
				break;
			}	
			}
			}	
if(p==3) {
	System.out.println("NO");
}
else {
for(int t=0;t<sb.length();t++) {
	char u=sb.charAt(t);
	System.out.println(u);
}			
}		
	}
}
