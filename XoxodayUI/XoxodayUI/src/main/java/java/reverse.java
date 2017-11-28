package java;

public class reverse {
	
	public static String str="My Name is Shailaja";
	
	public void reverseString() {
		StringBuilder builder=new StringBuilder();
		builder.reverse();
		System.out.println(builder.reverse());
	//	return builder.toString();
	}

	public static void main(String[] args) throws Throwable {
		reverse rev=new reverse();
		rev.reverseString();
	}

}
