package chap03.Ex12_Class;

import java.util.Calendar;

public class CalendarEx {

	public static void printCalendar(String msg, Calendar cal ) {
		
		int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH) + 1; // 0~11로 가져오므로 
	      int day = cal.get(Calendar.DAY_OF_MONTH);
	      int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일 0~6 인덱스로 가져옴
	      int hour = cal.get(Calendar.HOUR);
	      int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
	      int ampm = cal.get(Calendar.AM_PM); //오전인지 오후인지
	      int minute = cal.get(Calendar.MINUTE); 
	      int second = cal.get(Calendar.SECOND);
	      int millisecond = cal.get(Calendar.MILLISECOND);
	      System.out.print(msg + year + "/" + month + "/" + day +"/");
	
	      switch (dayOfWeek) {
	         case Calendar.SUNDAY: System.out.print("일요일"); break; // 1
	         case Calendar.MONDAY: System.out.print("월요일"); break; // 2
	         case Calendar.TUESDAY: System.out.print("화요일"); break;
	         case Calendar.WEDNESDAY: System.out.print("수요일"); break;
	         case Calendar.THURSDAY: System.out.print("목요일"); break;
	         case Calendar.FRIDAY: System.out.print("금요일"); break;
	         case Calendar.SATURDAY: System.out.print("토요일"); break;
	      }
	      System.out.print("(" + hourOfDay + "시)");
	      if( ampm == Calendar.AM )
	         System.out.print("오전 ");
	      else
	         System.out.print("오후 ");
	            
	      System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	
	}
	
	
	
	public static void main(StringTest[] args) {
		// 싱글톤 패턴이라 new 아니고 getInstance()로 가져옴
		Calendar now = Calendar.getInstance();
	      printCalendar("현재 ", now);
	      
	      Calendar firstDate = Calendar.getInstance();
	      firstDate.clear();
	      firstDate.set(2021, 1, 1);
	      
	      firstDate.set(Calendar.HOUR_OF_DAY, 20);
	      firstDate.set(Calendar.MINUTE, 30);
	      printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
