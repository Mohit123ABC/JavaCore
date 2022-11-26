package in.co.rays.Loop;
import java.util.Date;
import java.util.Calendar;

public class ExerciseMaintanance2 {
	public static void main(String []args) {
		Date d = new Date();
		
		//Get a Calendar for current locale & time zone
		Calendar cal = Calendar.getInstance();
		
		//Set to the current time
		cal.setTime(d);
		
		for(int i=1; i<=12; i++) {
			
			//get date after 30 days
			cal.add(Calendar.DATE,30);
			Date month = cal.getTime();
			System.out.println(month);
		}
		
	}

}
