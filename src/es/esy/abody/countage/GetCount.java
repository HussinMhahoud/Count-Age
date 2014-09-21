package es.esy.abody.countage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.net.ParseException;



public class GetCount {
	private String timeWanted ;
	private long timeWantedlong ;
	private String result ;
	private long resultlong  ;
	
	
	

		public GetCount (String time ) throws ParseException, java.text.ParseException{
			this.timeWanted = time ; 
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			java.util.Date date = dateFormat.parse(this.timeWanted);
			this.timeWantedlong = date.getTime() ;


		
	}
	
	public String getResult() {
		long timenow = System.currentTimeMillis();
		this.resultlong = timenow - this.timeWantedlong ;
		this.resultlong = this.resultlong/1000 ;
		int countY = (int) this.resultlong/31557600 ;
		int rest = (int)this.resultlong%31557600 ;
		int countM = (rest/2592000)%12 ;
		rest= rest%2592000;
		int countD = (rest/86400)%30 ;
		
		
		String result = "Years: "+ countY +" Months: " + countM +" Days: " + countD ;

		return result;
		

	}
	

}
