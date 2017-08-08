	static ArrayList<ArrayList<Integer>> findClosestToSum(int arr[],int val){

		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		if(arr ==null || arr.length<3)
			return list;

		int min=Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i++){
			
			int j=i+1;
			int k=arr.length-1;
			
			while(j<k){
				
				int sum = arr[i]+arr[j]+arr[k];
				
				if(Math.abs(val-sum) < min){
					min=Math.abs(val-sum);
					list.clear();
					ArrayList<Integer> temp= new ArrayList<Integer>();
					temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
					list.add(temp);
				}
				
				if(sum<val)
					j++;
				else 
					k--;
				
			}
			
		}
		return list;	

		
		
	}

