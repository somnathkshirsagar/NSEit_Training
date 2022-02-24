package Day2;

class A{ 
	int a;
	int b;
	int c;
	
	A(){
		a=1;
		b=2;
		c=3;
	}
	
	public void get() {
		System.out.println("A ="+a+" B ="+b+" C ="+c);
	}
}

class B extends A{
	int a;
	int b;
	int c;
	
	B(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void get() {
		System.out.println("A ="+a+" B ="+b+" C ="+c);
	}
	
}

class C extends B{
	int a;
	int b;
	int c;
	
	C(){
		super(10,20,30);
		a=100;
		b=200;
		c=300;
	}
	public void get() {
		System.out.println("A ="+a+" B ="+b+" C ="+c);
	}
	
}
public class InheritanceExp extends C {
	public static void main(String[] args) {
		C c1= new C();
	//	c1.get();
		B b1= new B(30,40,50);
		b1.get();
	}

}
