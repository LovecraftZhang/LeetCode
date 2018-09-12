class Untitled {
	public static void main(String[] args) {
		A a = new B();
		a.func();
		B b = new B();
		b.func();
	}
	
	public static class A{
		public static void func(){
			System.out.println("A");
		}
	}
	
	public static class B extends A {
			public static void func(){
				System.out.println("B");
			}
			
			public static void funcB() {
				System.out.println("B");
			}
		}
}