

import java.util.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
Stack  st=new Stack();
		
	int N=sc.nextInt();
	while(N-->0) {
	String a=sc.next();
	int sum=0;
	for(int i=0;i<a.length();i++) {
		
	
	if(a.charAt(i)=='(') {
		
		sum++;
		st.push('(');
	}
	else if(a.charAt(i)==')') {
		
		st.push(')');
		if(sum>0) {
			
			sum--;
			st.pop();
			st.pop();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
if(!st.isEmpty()) {
	System.out.println("NO");
}
else if(st.isEmpty()) {
	
	System.out.println("YES");
}
	
	while(!st.isEmpty()) {
		st.pop();
	}
	
	
		
	}
	
	
	
	}

}
