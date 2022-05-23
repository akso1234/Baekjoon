import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Arrays;
public class Main {

	static boolean [][] visited;
	static int [][]graph;
	static int sum=0;
	public static void dfs(int x,int y,int M, int N) {
		if(M>x&&x>=0&&N>y&&y>=0) {
			visited[x][y]=true;
			
			if(M>x+1&&N>y&&y>=0&&x+1>=0) {
			if(!visited[x+1][y]&& graph[x+1][y]==1) {
			
				
				dfs(x+1,y,M,N);
			}
			}
			if(N>y+1&&M>x&&x>=0&&y>=0) {
			if(!visited[x][y+1]&&graph[x][y+1]==1) {
				dfs(x,y+1,M,N);
			}
			}
			if(N>y-1&&M>x&&y-1>=0&&x>=0) {
				if(!visited[x][y-1]&&graph[x][y-1]==1) {
					dfs(x,y-1,M,N);
				}
				}
			if(N>y&&M>x-1&&x-1>=0&&y>=0) {
				if(!visited[x-1][y]&&graph[x-1][y]==1) {
					dfs(x-1,y,M,N);
				}
				}
		}
		
		
	}
	
	
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	 sum=0;
int M=sc.nextInt();
int N=sc.nextInt();
visited=new boolean[M+1][N+1];
graph=new int[M+1][N+1];


int k=sc.nextInt();
for(int j=0;j<k;j++) {
	int a=sc.nextInt();
	int b=sc.nextInt();
	graph[a][b]=1;
	
}

for(int x=0;x<M;x++) {
	for(int y=0;y<N;y++) {
		
		if(!visited[x][y]&&graph[x][y]==1) {
			
			dfs(x,y,M,N);
			sum++;
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}


System.out.println(sum);

}









	}
	
	
	
	
}
