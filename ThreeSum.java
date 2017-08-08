static ArrayList<ArrayList<Integer>> get3Sum(int arr[]){

		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

		if(arr==null || arr.length==0)
			return null;
		
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length-2;i++){
			
			  
			if(i==0  ||  arr[i] > arr[i-1]){
				
				int j=i+1;
				int k= arr.length-1;
				
				while(j<k){
				
					if(arr[i]+arr[j]+arr[k]==0){
					
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
						list.add(temp);
						j++;
						k--;
					
					
						//REmove duplicates
					
						while(j<k && arr[j]==arr[j-1])
							j++;
					
						while(j<k && arr[k] == arr[k+1])
							k--;
					
					}else if (arr[i] + arr[j] + arr[k] < 0)
						j++;
					else
						k--;
				
					}
				}
		}
		return list;
	}
