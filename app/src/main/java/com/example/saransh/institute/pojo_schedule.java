package com.example.saransh.institute;

public class pojo_schedule {
    String batch,start_date,end_date,day,time;
    public void setBatch(String batch)
    {
        this.batch=batch;
    }
    public void setDay(String day)
    {
        this.day=day;
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public void setStart_date(String start_date)
    {
        this.start_date=start_date;
    }
    public void setEnd_date(String end_date)
    {
        this.end_date=end_date;
    }

    public String getTime() {
        return time;
    }

    public String getBatch() {
        return batch;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getDay() {
        return day;
    }
}
