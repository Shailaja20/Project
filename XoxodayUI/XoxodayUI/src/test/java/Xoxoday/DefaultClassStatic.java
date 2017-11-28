package Xoxoday;

public class DefaultClassStatic {

	public static void main(String[] args) throws Exception {
		
		Static_Variable sta=new Static_Variable();
		Static_Variable sta1=new Static_Variable();

		sta.run();
		
		Static_Variable.j=5;
		sta1.run();
		
		Class.forName("Foo");


	}

}
