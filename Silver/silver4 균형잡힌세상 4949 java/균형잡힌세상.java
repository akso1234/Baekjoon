import java.util.*;



public class Main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);


		String s;
		
		
		while(true){
			
		
			
			s=sc.nextLine();
			if(s.equals(".")) {
				break;
			}
			
			
			print(s);
			
		}
		
	
				
}


public static void print(String s) {	
	Stack<Character> st=new Stack<Character>();
	for(int j=0;j<s.length();j++) {
		
		
		if(s.charAt(j)=='(') {
			st.push('(');
			
			
		}
		if(s.charAt(j)=='[') {
			st.push('[');
			
			
		}
		if(s.charAt(j)==')') {
			if(!st.isEmpty()&&st.peek()=='(') {
				st.pop();
			}
			else {
			st.push(')');
			}
			
		}
		
		
		if(s.charAt(j)==']') {
			if(!st.isEmpty()&&st.peek()=='[') {
				st.pop();
			}
			else {
			st.push(']');
			}
			
		}
		}	
		if(st.isEmpty()) {
			System.out.println("yes");
		}
			
		else {
			System.out.println("no");
		}	
		
		st.clear();
	}	

}
