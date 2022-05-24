import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Arrays;

public class Main {
	static int[] dx = { 0, -1, 0, 1 ,1,-1,-1,1};
	static int[] dy = { 1, 0, -1, 0 ,1,1,-1,-1};
	static boolean [][] visited;
	static int [][]graph;
	static int sum=0;
	public static void dfs(int y,int x,int M, int N) {
		
			visited[y][x]=true;
			for (int i = 0; i < 8; i++) {
				int cx = x + dx[i];
				int cy = y + dy[i];

				if (cx >= 0 && cy >= 0 && cy < M && cx < N) {
					if (!visited[cy][cx] && graph[cy][cx] == 1) {
						dfs(cy, cx,M,N);
					}
				}

			}
			
			
		}
		
		
	
	
	
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));




for(int i=0;true;i++) {
	 sum=0;
int N=sc.nextInt(); //x
int M=sc.nextInt(); //y
if(M==0&&N==0) {
	break;
}


visited=new boolean[M][N];
graph=new int[M][N];

for(int y=0;y<M;y++) {

	
	for(int x=0;x<N;x++) {
		int a=sc.nextInt();
		
		graph[y][x]=a;
		
		
	}
}


for(int y=0;y<M;y++) {
	for(int x=0;x<N;x++) {
		
		if(!visited[y][x]&&graph[y][x]==1) {
			
			dfs(y,x,M,N);
			sum++;
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}


System.out.println(sum);

}









	}
	
	
	
	
}
