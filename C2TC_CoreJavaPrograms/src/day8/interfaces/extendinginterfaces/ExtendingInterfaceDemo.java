package day8.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements Childinterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}

}
