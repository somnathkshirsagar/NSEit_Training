package Day3;


interface Genre{
	
	void adventure();
	void action();
	void drama();
	void comedy();
	void romance();
	void scifi();
	void timeTravel();
}

class Jumanji implements Genre{
	public void adventure() {
		System.out.println("This movie has adventure on a scale of 8/10");
	}
	public void action() {
		System.out.println("This movie has action on a scale of 6/10");
	}
	public void drama() {
		System.out.println("This movie has adventure on a scale of 4/10");
	}
	public void comedy() {
		System.out.println("This movie has adventure on a scale of 3/10");
	}
	public void romance() {
		System.out.println("This movie has adventure on a scale of 1/10");
	}
	public void scifi() {
		System.out.println("This movie has adventure on a scale of 2/10");
	}
	public void timeTravel() {
		System.out.println("This movie has adventure on a scale of 5/10");
	}
	
}
class Titanic implements Genre{
	public void adventure() {
		System.out.println("This movie has adventure on a scale of 3/10");
	}
	public void action() {
		System.out.println("This movie has action on a scale of 2/10");
	}
	public void drama() {
		System.out.println("This movie has adventure on a scale of 7/10");
	}
	public void comedy() {
		System.out.println("This movie has adventure on a scale of 2/10");
	}
	public void romance() {
		System.out.println("This movie has adventure on a scale of 9/10");
	}
	public void scifi() {
		System.out.println("This movie has adventure on a scale of 0/10");
	}
	public void timeTravel() {
		System.out.println("This movie has adventure on a scale of 0/10");
	}
	
}
class PiratesOfCarribean implements Genre{
	public void adventure() {
		System.out.println("This movie has adventure on a scale of 10/10");
	}
	public void action() {
		System.out.println("This movie has action on a scale of 9/10");
	}
	public void drama() {
		System.out.println("This movie has adventure on a scale of 7/10");
	}
	public void comedy() {
		System.out.println("This movie has adventure on a scale of 4/10");
	}
	public void romance() {
		System.out.println("This movie has adventure on a scale of 2/10");
	}
	public void scifi() {
		System.out.println("This movie has adventure on a scale of 3/10");
	}
	public void timeTravel() {
		System.out.println("This movie has adventure on a scale of 3/10");
	}
	
}
class Avengers implements Genre{
	public void adventure() {
		System.out.println("This movie has adventure on a scale of 4/10");
	}
	public void action() {
		System.out.println("This movie has action on a scale of 10/10");
	}
	public void drama() {
		System.out.println("This movie has adventure on a scale of 5/10");
	}
	public void comedy() {
		System.out.println("This movie has adventure on a scale of 3/10");
	}
	public void romance() {
		System.out.println("This movie has adventure on a scale of 2/10");
	}
	public void scifi() {
		System.out.println("This movie has adventure on a scale of 9/10");
	}
	public void timeTravel() {
		System.out.println("This movie has adventure on a scale of 7/10");
	}
	
}

public class InterfaceTest {
	
	public static void main(String[] args) {
		Jumanji j1=new Jumanji();
		Titanic t1=new Titanic();
		PiratesOfCarribean p1=new PiratesOfCarribean();
		
		j1.action();
	}

}
