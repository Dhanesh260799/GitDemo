import org.testng.annotations.BeforeMethod;

public class PS {

	
	public void dataGiver() {
		System.out.println("Inheritance");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Successfully logged in");
	}
}
