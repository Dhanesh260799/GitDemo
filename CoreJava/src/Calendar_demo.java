import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To access Calendar Class
		Calendar cal =Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat();
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
	

	}

}
