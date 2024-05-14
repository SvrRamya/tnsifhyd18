
/* Normal Whilw loop example
package controlStatements;

public class WhileExample {
	public static void main(String[] args) {  
	    int i=0;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
	}  


} */


//While loop using break and continue statements
package controlStatements;

public class WhileExample {
	public static void main(String[] args) {  
	    int i=0;  
	    while(i<=10){  
	    	if(i==4) {
	    		i++;
	    		break;
	    		//continue;
	    	}
	        System.out.println(i);  
	        i++;
	    }  
	}  


}
