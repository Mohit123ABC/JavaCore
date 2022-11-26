package in.co.rays.Loop;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExerciseComparision3 {
	public static void main(String []args)throws ParseException {
		String start = "10/10/10";
		String end = "12/2/12";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date start1 = sdf.parse(start);
		Date end1 = sdf.parse(end);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(start1);
		cal.setTime(end1);
		System.out.println(start1);
		System.out.println(end1);
		

	 //   if(start1.getTime()>end1.getTime());{
	//	System.out.println("Ok!!!");
	//	}else {
	//		System.out.println("error");
	//	}
		
	}

}
