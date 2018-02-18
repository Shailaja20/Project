package variables;

public class Simple {
	
	static byte by;
	boolean bo;
	static char ch;
	static short sh;
	static int in;
	static long ln;
	static float fl;
	static double du;
	String str;
	
	public void Simple() {
		System.out.println("i am in method Simple");
	}
	
	public static void main(String[] args) {
		/**
		 *  Typecasting (Narrowing)
		 */
		byte a = 10;
		byte b = 10;
		byte c = (byte) (a +b);
		System.out.println(c);
		
		short d = 10;
		short e = 10;
		short f = (short) (d+e);
		System.out.println(f);
		
		/**
		 * Overflow
		 */
		int i = 130;
		byte b1 = (byte) i;
		System.out.println(i);
		System.out.println("b1 value is :" +b1);
		
		/**
		 *  Widening
		 */
		int g = 10;
		float h = g;
		System.out.println(g);
		System.out.println(h);
		
		/**
		 * Printing default values of the variables
		 */
		Simple s=new Simple();
		
		System.out.println("Printing values of default values of the variables");		
		System.out.println(by);
		System.out.println(s.bo);
		System.out.println("char value is :" +ch);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(ln);
		System.out.println(fl);
		System.out.println(du);
		System.out.println(s.str);
		
		System.out.println("--------------------------------------------------");
		s.Simple();
	}

}
