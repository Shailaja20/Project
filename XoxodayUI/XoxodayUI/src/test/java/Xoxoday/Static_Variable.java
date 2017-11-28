package Xoxoday;

public class Static_Variable {
	int i=10;
	static int j=20;
	
	static {
		System.out.println("static is initializing");
	}
	
public void run() {
	System.out.println(j);
}
}

class Foo{ 
	
	static {
		System.out.println("foo is initializing");
	}
	
    public void stuff(){
     final int x=2;  //compilation error.
}
}

class Test {

    public static void main(String[] args) throws Exception {
    	Class.forName("Foo");
    	
        int x = 10;
        int y = 20;
        int z = 30;
        int w = 40;  
        final int i = 50;
        
    }
    
}