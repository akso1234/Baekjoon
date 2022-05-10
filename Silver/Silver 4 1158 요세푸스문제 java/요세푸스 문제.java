import java.util.*;
public class Main {

	private static final Object NULL = null;

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		Scanner sc =new Scanner(System.in);
		int z=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[5000];
		for(int i=1;i<=z;i++) {
		que.add(i); 
		
		}
		
		
		
		
		
	for(int j=0;0<que.size();j++) {
		
			for(int i=1;i<k;i++) {
				int val=que.poll();
				que.offer(val);
				
			
			
			}
			arr[j]=que.poll();
		
		}
	System.out.print("<");
	
	for(int i=1;i<=z;i++) {
		
		System.out.print(arr[i-1]);
		if(i==z) {
			break;
		}
		System.out.print(", ");
		
		
		}
	System.out.print(">");

}
}
