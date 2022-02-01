package Familia44;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class teste {

	public static void main(String[] args) {

		
		GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(gc.getTime()));
        
        gc.add(Calendar.HOUR,4);
        System.out.println(sdf.format(gc.getTime()));
		
	}

}