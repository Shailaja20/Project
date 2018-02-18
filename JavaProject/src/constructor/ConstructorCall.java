package constructor;

	class Parent
	{
	    String name;

	    public Parent(String n) 
	    {
	        name = n;
	        System.out.println("Parent Class Constructor is called");
	    }
	    
	}
	public class ConstructorCall extends Parent {
	    String name;

	    private ConstructorCall(String n1, String n2) 
	    {
	        super(n1);       //passing argument to parent class constructor
	        this.name = n2;
	    }
	    public void details()
	    {
	        System.out.println(super.name+" and "+name);
	    }
	     public static void main(String[] args)
	    {
	    	 ConstructorCall cobj = new ConstructorCall("ParentClass","ChildClass");
	        cobj.details();
	    }
	}
