import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	BigInteger arr[]= new BigInteger [1001];
	arr[0]=BigInteger.valueOf(1);
	arr[1]=BigInteger.valueOf(2);
	int a=1001;
	int num=sc.nextInt();
	for(int i=2;i<1001;i++) {
		
		arr[i]=arr[i-1].add(arr[i-2]);
		
		
		
	}
	
	
	System.out.println(arr[num-1].remainder(BigInteger.valueOf(10007)));
	
	
	

}
	}
