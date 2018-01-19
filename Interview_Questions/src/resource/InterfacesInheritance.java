package resource;

public class InterfacesInheritance {

    private static class ClassA {
	
	public String getMessage() {
	    return "A";
	}

    }

    private static class ClassB extends ClassA {	
	
	public String getMessage() {
	    return "B";
	}

    }

    private static class ClassC implements MyFace, MyFacePlus {

    }
    
    // both interfaces have same default method => class must override the method
    private static class ClassD implements MyFace, MyFace2 {

	@Override
	public String getMessage() {
	    
	    return MyFace.super.getMessage() + MyFace2.super.getMessage();
	}

    }

    interface MyFace {
	default String getMessage() {
	    return "Face";
	}

	static void sharedOutput() {
	    System.out.println("static output from interface");
	}
    }

    interface MyFacePlus extends MyFace {
	default String getMessage() {
	    return "FacePlus";
	}
    }
    
    interface MyFace2 {
	default String getMessage() {
	    return " Face2";
	}
    }
    
    public static class Class1 {
	public static void printMe() {
	    System.out.println("printed from class1");
	}
    }
    
    public static class Class2 extends Class1 {
	
	// this method hides static method from Class1 (there is no overriding)
	public static void printMe() {
	    System.out.println("printed from class2");
	}
    }

    public static void main(String[] args) {

	ClassB b = new ClassB();
	System.out.println(b.getMessage());

	ClassA a = b;
	// output is "B" because Subclass overrides instance method and is invoked
	System.out.println(a.getMessage());

	MyFace.sharedOutput();

	ClassC c = new ClassC();
	MyFace my = c;
	// output is "FacePlus" because overriding method of MyFacePlus is invoked, method of MyFace is ignored
	System.out.println("output c: " + my.getMessage());
	
	ClassD d = new ClassD();
	System.out.println("output d: " + d.getMessage());
	
	Class1.printMe();
	Class2.printMe();
	
	

    }

}
