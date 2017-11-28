package Final;

 final class FinalClass {

}
 
/* class SubClass extends FinalClass{
	 //Example of Final Class can not be Inherited by its SubClass.
 }*/
 
 class ParentClass{
	 
	 final void method1() {
		 System.out.println("I am in Method1");
	 }
 }
 
 class SubClass1 extends ParentClass{
	 
	/* void method1() {
		 //Final Mathod cannot be Overridden
		 System.out.println("I am in SubClass1 in Method1");
	 }*/
	 
	  public static void main(String[] args){
		  SubClass1 s1=new SubClass1();
		  s1.method1();
		 
	 }
 }
