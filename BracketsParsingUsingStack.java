	static boolean isParsingCorrect(String str){
		
		boolean isParsable=true;
		
		
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
		
		Stack<Character> stack=new Stack<Character>();
		
		
		char[] aa=str.toCharArray();
		
		for(char a:aa){
			
			if(map.keySet().contains(a)){
				stack.push(a);
			}else if(!stack.isEmpty() && ((Character)a).equals(map.get(stack.peek()))){
				stack.pop();
			}else if(map.values().contains(a) && stack.isEmpty()){
				return false;
			}
			
			
		}
		
		if(!stack.isEmpty())
			isParsable=false;
		
		return isParsable;
	}
