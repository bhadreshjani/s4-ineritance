
public class Parent1 {
	private void method1()
	{
		System.out.println ("Parent's method1()");
	} 
	public void method2()
	{
		System.out.println ("Parent's method2()");
		method1();
	}

	

}
	class Child extends Parent1
	{
		public void method1() 
		{ 
			System.out.println ("Child's method1()");
		}
		public static void main(String args[]) 
		{ 
			Parent1 p = new Child();
			p.method2();
		}
	}
// same copy gives error of "Main method not found in class Parent1"
	// if we put the main method in parent class then it gives Option C as answer