import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class JavaDateAndTime {

	public static void main(String[] args) {
		SimpleDateFormat d=new SimpleDateFormat();
		Calendar cal=Calendar.getInstance();
		int year=cal.get(cal.YEAR);
		System.out.println(year);
	 System.out.println(cal.get(cal.DATE));
	 System.out.println(cal.get(cal.DAY_OF_WEEK));
	 System.out.println(cal.get(cal.DAY_OF_MONTH));
	 System.out.println(cal.get(cal.DAY_OF_YEAR));
	 System.out.println(cal.getTime());
	 System.out.println(d.format(cal.getTime()));
	}

}
