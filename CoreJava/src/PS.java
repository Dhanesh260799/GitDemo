import org.testng.annotations.BeforeMethod;

public class PS {

	
	public void dataGiver() {
		System.out.println("Inheritance");
		System.out.println("Changed for cloned repo: Note");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Successfully logged in");
		System.out.println("Successfully logged in");

	}
}
