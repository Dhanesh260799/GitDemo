
public class Indian_trafficRule implements CentraltrafficSystem,Common_traffic{
	public static void main(String[] args) {
		CentraltrafficSystem a = new Indian_trafficRule();
		Indian_trafficRule b = new Indian_trafficRule();
		Common_traffic c = new Indian_trafficRule();
		a.Greengo();
		a.Redstop();
		a.YellowWait();
		b.Walk();
		c.central_signal();
		
	}
	public void Walk() {
		System.out.println("Go walk");
	}
	@Override
	public void Greengo() {
		// TODO Auto-generated method stub
		System.out.println("start your vehicle");
	}

	@Override
	public void Redstop() {
		// TODO Auto-generated method stub
		System.out.println("stop your vehicle");

	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("walk for the signal");

	}
	@Override
	public void central_signal() {
		// TODO Auto-generated method stub
		System.out.println("Common siganl");
	}

}
