public class time{
	private int hour;
	private int minute;
	private int second;
	
	public time (int h, int m, int s){
		hour = h;
		minute =  m;
		second = s;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public String toString(){
		return hour +":" + minute + ":" + second;
	}
	
	public void advanceHour(){
		hour = hour + 1;
	}
	
	public void advanceMinute(){
		if (minute >= 59){
			minute = 0;
			advanceHour();
		}
		else
		{
			minute = minute+1;
		}
	}
	public void advanceSecond(){
		if (second >= 59){
			second = 0;
			advanceMinute();
		}
		else
		{
			second = second+1;
		}
	}
	
}
