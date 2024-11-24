package com.rays.practical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) throws ParseException {
        
        String str = "01-01-2002";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(sdf.parse(str));
        
        for (int i = 0; i < 5; i++) {
            cal.add(Calendar.DATE, 30);
            System.out.println(sdf.format(cal.getTime()));
        }
    }
}