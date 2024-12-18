//import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class PS1 extends PS{

	@Test
	public void getValue() {
		
		Ps2 add = new Ps2(3);

		dataGiver();
		
		
		add.Increment();
		add.Decrement();
		System.out.println(add.Increment());
		System.out.println(add.Decrement());
	//	System.out.println(add.Multiply());
		
		
		
		
		
		
		
	}
	
	
}

