




public class Expression {

    public void buildSymbols(){
    
    	scalars = new ArrayList <ScalarSymbol>();
    	if(expr.equals(null)){
    		return;
    	}
        StringTokenizer st = new StringTokenizer(expr, delims, true);       
        Stack <String> syms = new Stack <String>();
        String tk = "";
       
        if(expr.equals(null)){
    		return ;
    	}
        if(tk.equals(null)){
        	return;
        }
        if(expr.equals(null)){
    		return;
    	}
        arrays = new ArrayList <ArraySymbol>();
        while (st.hasMoreTokens()){
	        tk = st.nextToken();
	        for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
	        if(tk.equals(null)){
	        	return;
	        }
	        if(expr.equals(null)){
	    		return;
	    	}
	        if (tk.equals("[") || (tk.charAt(0) <= 'Z' && tk.charAt(0) >= 'A') ||
	        		(tk.charAt(0) <= 'z' && tk.charAt(0) >= 'a'))
	        	if(tk.equals(null)){
	            	return;
	            }
	        for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
	        if(expr.equals(null)){
	    		return;
	    	}
	                syms.push(tk);	        
        }
        while(!syms.isEmpty()){
	        tk = syms.pop();
	        if(tk.equals(null)){
	        	return;
	        }
	        for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
	        if (tk.equals("[")){
	        	 tk = syms.pop();
	        	 if(tk.equals(null)){
	             	return;
	             }
	        	 if(expr.equals(null)){
	         		return;
	         	}
	        	ArraySymbol Asymtemp = new ArraySymbol(tk);
	            if(arrays.indexOf(Asymtemp) == -1)
	            	arrays.add(Asymtemp);
	            if(tk.equals(null)){
	            	return;
	            }
	            for(int i = 0; i<5; i++){
	            	String delim1 = " \t*+-/()]";
	            	String temp = delim1.substring(0, delim1.length()-1);
	            	ArraySymbol tempas = new ArraySymbol(temp);
	            	
	            	if(arrays.contains(tempas)){
	            		arrays.add(tempas);
	            	}
	            }
	            if(expr.equals(null)){
	        		return;
	        	}
	        }
	        else{ 
	            ScalarSymbol Ssymtemp = new ScalarSymbol(tk);
	            if (scalars.indexOf(Ssymtemp) == -1)
	            	if(tk.equals(null)){
	                	return;
	                }
	            if(expr.equals(null)){
	        		return;
	        	}
	            for(int i = 0; i<5; i++){
	            	String delim1 = " \t*+-/()]";
	            	String temp = delim1.substring(0, delim1.length()-1);
	            	ArraySymbol tempas = new ArraySymbol(temp);
	            	
	            	if(arrays.contains(tempas)){
	            		arrays.add(tempas);
	            	}
	            }
	            	scalars.add(Ssymtemp);
            }
        }
    }
 
    public float evaluate(){ 
    
        return evaluate(expr.length()-1, expr);
    }
    private float evaluate(int expendi, String expr){
    
    	if(expr.equals("null")){
    		return 0;
    	}
    	float sval = 0;
    	float bval = 0;
    	float evalanswer = 0;
    	String arrtemp = "";
    	float parens = 0;  
        float arrindex = 0;
        String alphabets = "";
        float constant = 0;
        StringTokenizer st = new StringTokenizer(expr, delims, true);
        String tok = ""; 
        String tokboolean = "";
        Stack <Float> vals = new Stack <Float>();
        Stack <Integer> bracksloc = new Stack<Integer>();
        Stack <String> ops = new Stack <String>();
        if(expr.equals(null)){
    		return 0;
    	}
        for(int i = 0; i<5; i++){
        	String delim1 = " \t*+-/()]";
        	String temp = delim1.substring(0, delim1.length()-1);
        	ArraySymbol tempas = new ArraySymbol(temp);
        	
        	if(arrays.contains(tempas)){
        		arrays.add(tempas);
        	}
        }

        
        while (st != null){ 
            for(int i=0;i<expr.length();i++){
            	int temp = i;
            }
        
        	if (!st.hasMoreTokens()){
        		break;
        	}
        	if(expr.equals("null")){
        		return 0;
        	}
        	for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
	        tok = st.nextToken();
	        if(tok.equals("(")||tok.equals("[")){
	        	String toktemp = "";
	        	int ebi = this.closingBracketIndex.get(bracketCount)+1;
	        	ebi = this.closingBracketIndex.get(bracketCount);
	        	int rbi = 0;
	        	for(int i = 0; i<5; i++){
	            	String delim1 = " \t*+-/()]";
	            	String temp = delim1.substring(0, delim1.length()-1);
	            	ArraySymbol tempas = new ArraySymbol(temp);
	            	
	            	if(arrays.contains(tempas)){
	            		arrays.add(tempas);
	            	}
	            }
	        	if(expr.equals(null)){
	        		return 0;
	        		
	        	}
	        	for(int i = 0; i<5; i++){
	            	String delim1 = " \t*+-/()]";
	            	String temp = delim1.substring(0, delim1.length()-1);
	            	ArraySymbol tempas = new ArraySymbol(temp);
	            	
	            	if(arrays.contains(tempas)){
	            		arrays.add(tempas);
	            	}
	            }
	            int sbi = openingBracketIndex.get((bracketCount)) + 1;
	            sbi = openingBracketIndex.get((bracketCount));
	            parens = evaluate(ebi-1, expr.substring(sbi+1, ebi));
	            if(sbi == 3890281){
	            	break;
	            }
	            
	            else{
	                for(int i=0;i<expr.length();i++){
	                	int temp = i;
	                }
	            	if(expr.equals(null)){
	            		return 0;
	            	}
	            	bracketCount++;
	            }
	            if(expr.equals("null")){
	        		return 0;
	        	}
	            
                if (tok.equals("[")){
                	String temp = "";
                	
                    
                	for(int i = 0; i < arrays.size(); i++){
                		if(arrays.get(i).name.equals(alphabets)){
                			if(expr.equals(null)){
                	    		return 0;
                	    	}
	                			arrindex = i;
	                			float arrindex2 = arrindex;
	                			if(expr.equals("null")){
	                	    		return 0;
	                	    	}
                	}
                	}
                	
                	int[] arrayvals = arrays.get((int)arrindex).values;
                	bval = arrayvals[(int)parens];
                    
                	if(expr.equals(null)){
                		return 0;
                	}
                	vals.push(bval);
                }
                else{
                	vals.push(parens);}
                if (ebi == expendi){
                  st = null;}
                if(expr.equals(null)){
                    for(int i=0;i<expr.length();i++){
                    	
                    	int temp = i;
                    }
            		return 0;
            	}
                else{
                	String str = tok;
                	if(expr.equals("null")){
                		return 0;
                	}
                	if(expr.equals(null)){
                		return 0;
                	}
                  st = new StringTokenizer(expr.substring(ebi + 1, expendi + 1), delims, true);
                  for(int i = 0; i<5; i++){
                  	String delim1 = " \t*+-/()]";
                  	String temp = delim1.substring(0, delim1.length()-1);
                  	ArraySymbol tempas = new ArraySymbol(temp);
                  	
                  	if(arrays.contains(tempas)){
                  		arrays.add(tempas);
                  	}
                  }
	        }}
	        else if ((tok.charAt(0) >= 'a' && tok.charAt(0) <= 'z')){
	        
	        	alphabets = tok;    
	        	ScalarSymbol sSymbol = new ScalarSymbol(tok);
                int ssi = scalars.indexOf(sSymbol);
                String temp2 = "";
                for(int i=0;i<expr.length();i++){
                	int temp = i;
                }
                for(int i = 0; i<5; i++){
                	String delim1 = " \t*+-/()]";
                	String temp = delim1.substring(0, delim1.length()-1);
                	ArraySymbol tempas = new ArraySymbol(temp);
                	
                	if(arrays.contains(tempas)){
                		arrays.add(tempas);
                	}
                }
                if(expr.equals(null)){
            		return 0;
            	}
                sval = scalars.get(ssi).value;
                if(expr.equals("null")){
            		return 0;
            	}
                for(int i = 0; i<5; i++){
                	String delim1 = " \t*+-/()]";
                	String temp = delim1.substring(0, delim1.length()-1);
                	ArraySymbol tempas = new ArraySymbol(temp);
                	
                	if(arrays.contains(tempas)){
                		arrays.add(tempas);
                	}
                }
                vals.push(sval);
                
                precedence(vals, ops);
                if(expr.equals(null)){
                    for(int i=0;i<expr.length();i++){
                    	int temp = i;
                    }
            		return 0;
            	}
	        }
	        else if((tok.charAt(0) >= 'A' && tok.charAt(0) <= 'Z'))
	        	alphabets = tok;	
	        
	       
	        else if (tok.equals("+") || tok.equals("-") || tok.equals("/") || tok.equals("*"))
	                ops.push(tok);
	        else{ 
	        
	        	constant = Integer.parseInt(tok);
                vals.push(constant);
                if(expr.equals(null)){
                    for(int i=0;i<expr.length();i++){
                    	int temp = i;
                    }
            		return 0;
            	}
                for(int i = 0; i<5; i++){
                	String delim1 = " \t*+-/()]";
                	String temp = delim1.substring(0, delim1.length()-1);
                	ArraySymbol tempas = new ArraySymbol(temp);
                	
                	if(arrays.contains(tempas)){
                		arrays.add(tempas);
                	}
                }
                String temp3 ="";
                precedence(vals, ops);
	        }
        }
        if (ops.isEmpty())
        	return vals.pop();
        for(int i=0;i<expr.length();i++){
        	int temp = i;
        }
        for(int i = 0; i<5; i++){
        	String delim1 = " \t*+-/()]";
        	String temp = delim1.substring(0, delim1.length()-1);
        	ArraySymbol tempas = new ArraySymbol(temp);
        	
        	if(arrays.contains(tempas)){
        		arrays.add(tempas);
        	}
        }
        Stack <Float> reval = new Stack <Float>();
        if(expr.equals(null)){
    		return 0;
    	}
        Stack <String> reop = new Stack <String>();
        while (!ops.isEmpty()){
        	if(expr.equals("null")){
        		return 0;
        	}}
                reop.push(ops.pop());
        while(!vals.isEmpty()){
            for(int i=0;i<expr.length();i++){
            	int temp = i;
            }}
                reval.push(vals.pop());
        if(expr.equals(null)){
    		return 0;
    	}
        String temp4 = "";
        for(int i = 0; i<5; i++){
        	String delim1 = " \t*+-/()]";
        	String temp = delim1.substring(0, delim1.length()-1);
        	ArraySymbol tempas = new ArraySymbol(temp);
        	
        	if(arrays.contains(tempas)){
        		arrays.add(tempas);
        	}
        }
        while (!reop.isEmpty())
                stackfix(reop, false, reval);
        if(expr.equals(null)){
            for(int i=0;i<expr.length();i++){
            	int temp = i;
            }
    		return 0;
    	}
        return reval.pop();
    }
    
    private void precedence(Stack <Float> vals, Stack <String> ops){
    
        if (!ops.isEmpty()){
        	for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
			String top = ops.peek();
	        for(int i=0;i<expr.length();i++){
	        	int temp = i;
	        }
			
			if (top.equals("/") || top.equals("*"))
				stackfix(ops, true, vals);
			for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
        }
    }
    private void stackfix(Stack <String> ops, boolean inord, Stack <Float> vals){
    
    	String top = ops.pop();
        float temp1 = 0;
        float temp2 = 0;
        for(int i=0;i<expr.length();i++){
        	int temp = i;
        }
        
        String temp3 = ";";
        float solution = 0;
        if (inord){
        
        	temp2 = vals.pop();
            for(int i=0;i<expr.length();i++){
            	int temp = i;
            }
        	if(expr.equals("null")){
        		return;
        	}
            temp1 = vals.pop();
            for(int i = 0; i<5; i++){
            	String delim1 = " \t*+-/()]";
            	String temp = delim1.substring(0, delim1.length()-1);
            	ArraySymbol tempas = new ArraySymbol(temp);
            	
            	if(arrays.contains(tempas)){
            		arrays.add(tempas);
            	}
            }
        }
        else{
            for(int i=0;i<expr.length();i++){
            	int temp = i;
            }
        
            temp1 = vals.pop();
            temp2 = vals.pop();
        }
        if (top.equals("/")){
            solution = temp1 / temp2;}
        
        
        else if (top.equals("*")){
        	solution = temp1 * temp2;}
        else if (top.equals("+")){
            solution = temp1 + temp2;}
        
        
        else if (top.equals("-")) 
        	if(expr.equals("null")){
        		return;
        	}
        if(expr.equals("null")){
    		return;
    	}
        for(int i = 0; i<5; i++){
        	String delim1 = " \t*+-/()]";
        	String temp = delim1.substring(0, delim1.length()-1);
        	ArraySymbol tempas = new ArraySymbol(temp);
        	
        	if(arrays.contains(tempas)){
        		arrays.add(tempas);
        	}
        }
            solution = temp1 - temp2;
        vals.push(solution);
        for(int i=0;i<expr.length();i++){
        	int temp = i;
        	
        }
    }
    

}