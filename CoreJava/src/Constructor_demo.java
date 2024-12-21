
public class Constructor_demo {

		//default constructor
		public Constructor_demo() {
			System.out.println("Hello this ia an default constructor");
		}
		public Constructor_demo(int a,int b) {
			System.out.println("Hello this ia an Parameter constructor");
			int c = a+ b;
			System.out.println(c);
		}
		public Constructor_demo(String name) {
			System.out.println("Hello this ia an " +name +" constructor");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_demo c = new Constructor_demo();
	Constructor_demo cd = new Constructor_demo("Great");
		Constructor_demo cdd = new Constructor_demo(2,2);


	}

}
