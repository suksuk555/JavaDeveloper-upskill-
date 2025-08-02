public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time(){
        //constructor
    }

    public Time(int second, int minute , int hour){
        // this.second = second;
        // this.minute = minute;
        // this.hour = hour;
        setTime(hour, minute, second);
    }
     public int getHour(){
        return this.hour;
        
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }

     public void setHour(int hour){

        if(hour < 0 || hour>24){
            throw new IllegalArgumentException("Hour must between 0 and 23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute){
        if(minute < 0 || hour>59){
            throw new IllegalArgumentException("Minute must between 0 and 59");
        }
        this.minute = minute;
    }
    public void setSecond(int second){
        if(second < 0 || second>59){
            throw new IllegalArgumentException("Second must between 0 and 59");
        }
        this.second = second;
    }

    

    public void setTime(int hour,int minute,int second){

        setHour(hour);
        setHour(minute);
        setHour(second);
        // this.hour = hour;
        // this.minute = minute;
        // this.second = second;

    }
    
    public String tostring(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond(){
        this.second++;
        if(this.second == 60){
            this.second=0;
            this.minute++;
            if(this.minute == 60){
                this.minute =0;
                this.hour++;
                if(this.hour ==24){
                    this.hour=0;
                }
            }
        }
        
        return this;
    }
}
