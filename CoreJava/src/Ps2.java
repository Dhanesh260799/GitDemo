
public class Ps2 extends PS3 {
	
	int a;
	//default constructor
/*	public Ps2(int a) {
		super(a);
		this.a=a;
	}*/


	public Ps2(int a) {
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;
	}


	public int Increment() {
		 a=a+1;
		 return a;
	}
	
	
	public int Decrement() {
		 a=a-1;
		 return a;
	}
	
	

}
