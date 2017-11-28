package staticProperty;

public class StaticClass {

	   static int x = 100;
	   int y = 100;
	   int z;
	   
	   public void increment()
	   {
	       x++;
	       y++;
	   }
	   
	   public static void method1() {
		   System.out.println("I am in method1");
	   }
	   
	 public static void main( String[] args )
	 {
		 StaticClass t1 = new StaticClass();
		 StaticClass t2 = new StaticClass();
	     t1.increment();
	     t2.increment();
	     
	     method1();
	     
	    // z=102;
	     
	    // While instance variable y show only the change made to it by increment()
	    // method on that particular instance.
	     System.out.println("y value is " +t2.y);
	     
	     //The difference in output is because the static variable shows the changes 
	     //made to it by increment() on different Object.
	     System.out.println("x value is " +StaticClass.x); //accessed without any instance of class.
	 }
	}

	class SubClass extends StaticClass {
	/*	public void method1() {
			System.out.println("I am in SubClass");
		}*/
	} 
