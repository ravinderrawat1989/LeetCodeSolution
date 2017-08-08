	static ArrayList<ArrayList<Integer>> combinationSum(int arr[],int val){
		
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		if(arr==null || arr.length==0)
			return list;
		
		Arrays.sort(arr);
		
		combinationSumGet(arr,4,0,new ArrayList<Integer>(), list);
		return list;
	}
	
	
	
	static void combinationSumGet(int arr[],int target,int j,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> result){
				
		if(target==0){
			
			ArrayList<Integer> temp=new ArrayList<Integer>(cur);
			result.add(temp);
			System.out.println("added" + temp);
			return;
		}
		
		
		for (int i=j; i<arr.length;i++){
		
			if(target<arr[i])
				return;
			
			cur.add(arr[i]);
			
			System.out.println("i=" + i + " j=" + j +" target="+target + " cur="+cur );
			combinationSumGet(arr,target-arr[i],i,cur,result);
			cur.remove(cur.size()-1);
			
		}
		
	}	
	}	
	
