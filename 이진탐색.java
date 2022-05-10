public static void find(int min,int max,int []arr,int find ) {
		int mid=(min+max)/2;
		
		
		
		if(mid>5) {
			max=mid-1;
			find(min, max,arr,5);
			
		}
		else if (mid<5) {
			min=mid+1;
			find(min, max,arr,5 );
		}
		else {
			System.out.println(mid);
		}
	
	
	}
