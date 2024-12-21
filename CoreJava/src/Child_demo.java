
public class Child_demo extends Parent_demo {
	String name="balu";//global variable
	String name1 ="Ramu";
	public Child_demo() {
		super();//it should always be in the line
		System.out.println("hey I'll execute first, but if you want to"
				+ " execute the parent class "
				+ "constructor use super keyword");
	}
	public void getData() {
		//System.out.println("hello world");
		super.getData();
		System.out.println(name);

		System.out.println(super.name);
	}
	public void getdata1() {
		String name1="kanna";
		System.out.println(this.name1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_demo ch = new Child_demo();
		ch.getData();
		ch.getdata1();
		
	}

}
