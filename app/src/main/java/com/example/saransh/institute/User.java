package com.example.saransh.institute;

import android.widget.EditText;

public class User {
        String Name,batch,Id,course,Username,Password;
        public void setName(String Name)
        {
          this.Name=Name;
        }
        public void setId(String Id)
        {
            this.Id=Id;
        }
        public void setBatch(String batch)
        {
            this.batch=batch;
        }
        public void setCourse(String course)
        {
            this.course=course;
        }
        public void setUsername(String Username){this.Username=Username;}
        public void setPassword(String Password){this.Password=Password;}
        public String getName()
        {
            return this.Name;
        }
    public String getBatch()
    {
        return this.batch;
    }
    public String getId()
    {
        return this.Id;
    }
    public String getCourse()
    {
        return this.course;
    }
    public String getUsername(){return this.Username;}
    public String getPassword(){return this.Password;}
}
