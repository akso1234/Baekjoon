import java.util.Arrays;

import java.util.StringTokenizer;


	

	
import java.io.*;
import java.util.*;
import java.util.Stack;
public class WordSort {

	public static void main(String[] args)throws IOException {
	
	PriorityQueue <Integer> qu=new PriorityQueue();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList <Character> ar=new ArrayList();
	ArrayList <Integer> arr=new ArrayList();
	
	
	
	
	String s=br.readLine();
	String [] spt=s.split("\\+|-");
	for(int i=0;i<spt.length;i++) {
		arr.add(Integer.parseInt(spt[i]));
	}
	
	
	int i=0;
	
	while(i<s.length()) {
		
		if(s.charAt(i)=='+'||s.charAt(i)=='-') {
		
		
		ar.add(s.charAt(i));
	}
		
	i++;
	}
int num=ar.size();
int t=0;
for(int k=0;k<num;k++) {
	
	
	if(ar.get(0)=='+') {
		int sum=arr.get(k-t)+arr.get(k+1-t);
		
		arr.remove(k-t);
		arr.remove(k-t);
		arr.add(k-t, sum);
		t++;
	}
	
	ar.remove(0);
	
}

int suml=arr.get(0);
for(int k=1;k<arr.size();k++) {
	
	
suml-=arr.get(k);	
	
	
	
	
}

System.out.println(suml);
	




}


}
