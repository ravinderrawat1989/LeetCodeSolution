	public static void findDuplicateParanthesis(String str){
		
		//     (((a+(b)))+(c+d))
		int counter=0;
		char[] array=str.toCharArray();
		
		Stack<Character> s1=new Stack<Character>();
		Stack<Character> s2=new Stack<Character>();
		
		for(char a:array){
			
			if( a=='(' ){
				s1.push(a);
			}else if( a != ')' ){
				
				if(counter>0){
					s1.clear();
					s2.clear();
					counter=0;
				}else{
					s2.push(a);
				}
				
			}else if( a == ')'  && !s1.isEmpty()){
				counter++;
				s1.pop();
				
				if(counter>1){
					System.out.println("Found on expression with duplicate ()");
					System.out.println(s2);
					s2.clear();
				}
			}
			
		}
				
	}
