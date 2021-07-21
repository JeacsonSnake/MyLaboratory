
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public  void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    
    public Time nextSecond() {

        setSecond(getSecond()+1);
        if(getSecond()>=60)
        {
            setSecond(getSecond()-60);
            setMinute(getMinute()+1);
            if(getMinute()>=60)
            {
                setMinute(getMinute()-60);
                setHour(getHour()+1);
                if(getHour()>=24)
                {
                    setHour(getHour()-24);
                }
            }
        }

        return this; 
    }
    public Time previousSecond() {
        setSecond(getSecond()-1);
        if(second<0)
        {
            setSecond(getSecond()+60);
            setMinute(getMinute()-1);
            if(getMinute()<0)
            {
                setMinute(getMinute()+60);
                setHour(getHour()-1);
                if(getHour()<0)
                {
                    setHour(getHour()+24);
                }
            }
        }

        return this; 
    }

    @Override
    public String toString() {
        String detail = "0";
        if (hour<10)
        {
            detail = "0"+hour;
        }
        else
        {
            detail=Integer.toString(hour);
        }
        if (minute<10)
        {
            detail+=":0"+minute;
        }
        else
        {
            detail+=":"+minute;
        }
        if (second<10)
        {
            detail+=":0"+second;
        }
        else
        {
            detail+=":"+second;
        }
        return detail;

    }
}
