package Xoxoday;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
