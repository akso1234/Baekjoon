import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Arrays;
public class Main {

	static boolean [][] visited;
	static char [][]graph;
	static char [][]graphl;
	static boolean [][] visitedd;
	static int []dx= {0,1,0,-1};
	static int []dy= {-1,0,1,0};
	static int sum=0;
	public static void dfs(int x,int y,int N,char color) {
		
		
		
			
			visited[x][y]=true;
			for(int i=0;i<4;i++) {
				int cx=x+dx[i];
				int cy=y+dy[i];
				
				if(cx>=0&&N>cx&&N>cy&&cy>=0) {
					
					if(!visited[cx][cy]&&graph[cx][cy]==color) {
						
						dfs(cx,cy,N,color);
					}
				
				
				}
				
				
				}
			
		
		
		
	}
public static void dfsl(int x,int y,int N,char color) {
	visitedd[x][y]=true;
		
	for(int i=0;i<4;i++) {
		int cx=x+dx[i];
		int cy=y+dy[i];
		
		if(cx>=0&&N>cx&&N>cy&&cy>=0) {
			
			if(!visitedd[cx][cy]&&graphl[cx][cy]==color) {
				
				dfsl(cx,cy,N,color);
			}
		
		
		}
		
		
		}
	
		
		
	}

	
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	 sum=0;

int N=sc.nextInt();
visited=new boolean[N][N];
visitedd=new boolean[N][N];
graph=new char[N][N];

graphl=new char[N][N];

for(int j=0;j<N;j++) {
	String c=sc.next();
	
	for(int i=0;i<N;i++) {
		
		graph[i][j]=c.charAt(i);
		if(c.charAt(i)=='G') {
			graphl[i][j]='R';
		}
		else {
			graphl[i][j]=c.charAt(i);
		}
		
	}
	
	
	
	
}

for(int x=0;x<N;x++) {
	for(int y=0;y<N;y++) {
		
		if(!visited[y][x]&&graph[y][x]=='R') {
			
			dfs(y,x,N,'R');
			sum++;
		}
		
if(!visited[y][x]&&graph[y][x]=='G') {
			
			dfs(y,x,N,'G');
			sum++;
		}


if(!visited[y][x]&&graph[y][x]=='B') {
	
	dfs(y,x,N,'B');
	sum++;
}	
		
		
		
		
	}
	
	
	
	
	
}
int suml=0;
for(int x=0;x<N;x++) {
	for(int y=0;y<N;y++) {
		
		if(!visitedd[y][x]&&graphl[y][x]=='R') {
			
			dfsl(y,x,N,'R');
			suml++;
		}
		
		else if(!visitedd[y][x]&&graphl[y][x]=='B') {
			
			dfsl(y,x,N,'B');
			suml++;
		}
		
		


		
		
		
		
		
	}
	
	
	
	
	
}

System.out.print(sum+" ");
System.out.print(suml);




}









	}
	
