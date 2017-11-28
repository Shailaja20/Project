package garbageCollection;

public class Garbage1 {

		 protected void finalize(){System.out.println("object is garbage collected");}

		 public static void main(String args[]){
			 new Garbage1();
			 Garbage1 s2=new Garbage1();
		  s2=null;
		  System.gc();
		  
		  /*Garbage1 s3=new Garbage1();
		  s3.finalize();*/
		 }
		}
