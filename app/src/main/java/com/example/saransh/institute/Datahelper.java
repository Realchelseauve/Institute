package com.example.saransh.institute;
import android.content.ContentResolver;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Datahelper extends SQLiteOpenHelper {

    private static final String name = "sign_up1";
    User u1=new User();
    getset_query s1=new getset_query();
    pojo_schedule b1=new pojo_schedule();
    private static final int version = 2;
    public SQLiteDatabase db;
    public Datahelper(Context context) {
        super(context, name, null, version);
    }

    public void signUp(User user) {
        db = this.getWritableDatabase();
        String Batch = user.getBatch();
        String Id = user.getId();
        String Course = user.getCourse();
        String Name = user.getName();
        String Username = user.getUsername();
        String Password = user.getPassword();
        String InsertSql = "INSERT INTO " + "signup1" + "(" + "Id ," + "Batch ," + "Name ," + "Course ," + "Username ," + "Password ," + "Choice" + ")" + "VALUES" + "(" + "? ," + "? ," + "? ," + "? ," + "? ," + "? ," + "? " +")";
        db.execSQL(InsertSql, new String[]{Id, Batch, Name, Course, Username, Password,"0"});
        Log.i("DataHelp", "Inserted");
    }

   public void queryInsert(getset_query s1)
   {
      db=this.getWritableDatabase();
      String question = s1.getQuestion();
      String id=UnivId.userId;
      String response = s1.getResponse();
      String record="";
      Cursor csr= db.rawQuery("SELECT max(Record) as Record from queries",null);
      while(csr.moveToNext())
      {

              record = csr.getString(csr.getColumnIndex("Record"));

      }

      if(record==null) {
          record = "0";
      }
      else
      {
      record=""+(Integer.parseInt(record.trim())+1);}

      String InsertSql = "INSERT INTO " + "queries" + "(" + "Record ," + "Id ," + "Question ," + "Response" + ")" + "VALUES" + "(" + "? ," + "? ," + "? ," + "?" + ")" ;
      db.execSQL(InsertSql, new String[]{record, id, question, "Not Answered Yet"});
   }
   public void schedule_insert(pojo_schedule b1)
   {
       db=this.getWritableDatabase();
       String day=b1.getDay();
       String batch=b1.getBatch();
       String start_date=b1.getStart_date();
       String end_date=b1.getEnd_date();
       String time=b1.getTime();
       String record="";
       Cursor csr= db.rawQuery("SELECT max(SerialNo) as SerialNo from time_table",null);
       while(csr.moveToNext())
       {

           record = csr.getString(csr.getColumnIndex("SerialNo"));

       }
       if(record==null){
           record="0";
       }
       else
       {
           record=""+(Integer.parseInt(record.trim())+1);}
       String insertSql = "INSERT INTO " + "time_table" + "(" + "SerialNo ," + "Batch ," + "Day ," + "Start_date ," + "Time ," + "End_date" + ")" + "VALUES" + "(" + "? ," +"? ," + "? ," + "? ," + "? ," + "?" + ")";
       db.execSQL(insertSql,new String[]{record,batch,day,start_date,time,end_date });
   }
   public String displayTime(String batch , String day)
   {
      db=this.getWritableDatabase();
      String result="";
      Cursor csr=db.rawQuery("SELECT Time FROM time_table WHERE Batch = '"+batch+"' AND Day = '"+day+"'",null);
      while(csr.moveToNext())
      {
          result = csr.getString(csr.getColumnIndex("Time"));
      }
      return result;
   }
   public void changeResponse(String record, String response)
   {
       String Change = " UPDATE queries set Response = '"+response+"' where Record = '"+record+"' " ;
       db.execSQL(Change);
   }
   public String displayres(String id)
   {
       db=this.getWritableDatabase();
       String result="";
       Cursor csr= db.rawQuery("SELECT Question , Response FROM queries WHERE Id = '"+id+"'",null);
       while(csr.moveToNext())
       {
           String question = csr.getString(csr.getColumnIndex("Question"));
           String response = csr.getString(csr.getColumnIndex("Response"));
           result=result.concat("\n"+ question +"\n" + response);
       }
       return result;
   }
   public String dispQuery()
   {
       db=this.getWritableDatabase();
       Cursor csr=db.rawQuery("SELECT * FROM queries ",null);
       String Result = new String("");
       while(csr.moveToNext())
       {
           String Question =csr.getString(csr.getColumnIndex("Question"));
           String record =csr.getString(csr.getColumnIndex("Record"));
           String response = csr.getString(csr.getColumnIndex("Response"));
           String id = csr.getString(csr.getColumnIndex("Id"));
           Result = Result.concat("\n " + record + "\n" + Question + "\n" + response + "\n" + id);
       }
       return Result;
   }
    public String showEntries() {
        db = this.getWritableDatabase();
        String Result=new String("");
        Cursor csr = new Cursor() {
            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public int getPosition() {
                return 0;
            }

            @Override
            public boolean move(int i) {
                return false;
            }

            @Override
            public boolean moveToPosition(int i) {
                return false;
            }

            @Override
            public boolean moveToFirst() {
                return false;
            }

            @Override
            public boolean moveToLast() {
                return false;
            }

            @Override
            public boolean moveToNext() {
                return false;
            }

            @Override
            public boolean moveToPrevious() {
                return false;
            }

            @Override
            public boolean isFirst() {
                return false;
            }

            @Override
            public boolean isLast() {
                return false;
            }

            @Override
            public boolean isBeforeFirst() {
                return false;
            }

            @Override
            public boolean isAfterLast() {
                return false;
            }

            @Override
            public int getColumnIndex(String s) {
                return 0;
            }

            @Override
            public int getColumnIndexOrThrow(String s) throws IllegalArgumentException {
                return 0;
            }

            @Override
            public String getColumnName(int i) {
                return null;
            }

            @Override
            public String[] getColumnNames() {
                return new String[0];
            }

            @Override
            public int getColumnCount() {
                return 0;
            }

            @Override
            public byte[] getBlob(int i) {
                return new byte[0];
            }

            @Override
            public String getString(int i) {
                return null;
            }

            @Override
            public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {

            }

            @Override
            public short getShort(int i) {
                return 0;
            }

            @Override
            public int getInt(int i) {
                return 0;
            }

            @Override
            public long getLong(int i) {
                return 0;
            }

            @Override
            public float getFloat(int i) {
                return 0;
            }

            @Override
            public double getDouble(int i) {
                return 0;
            }

            @Override
            public int getType(int i) {
                return 0;
            }

            @Override
            public boolean isNull(int i) {
                return false;
            }

            @Override
            public void deactivate() {

            }

            @Override
            public boolean requery() {
                return false;
            }

            @Override
            public void close() {

            }

            @Override
            public boolean isClosed() {
                return false;
            }

            @Override
            public void registerContentObserver(ContentObserver contentObserver) {

            }

            @Override
            public void unregisterContentObserver(ContentObserver contentObserver) {

            }

            @Override
            public void registerDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public void setNotificationUri(ContentResolver contentResolver, Uri uri) {

            }

            @Override
            public Uri getNotificationUri() {
                return null;
            }

            @Override
            public boolean getWantsAllOnMoveCalls() {
                return false;
            }

            @Override
            public void setExtras(Bundle bundle) {

            }

            @Override
            public Bundle getExtras() {
                return null;
            }

            @Override
            public Bundle respond(Bundle bundle) {
                return null;
            }
        };
        try {
            csr = db.rawQuery(" SELECT * FROM signup1 WHERE Choice = 1",null);
        } catch (Exception ex) {
            Log.i("DataHelp", ex.getMessage());
        }
        int i = 0;
        while (csr.moveToNext()) {
             Result = Result.concat("\n " + csr.getString(csr.getColumnIndex("Name")) +
                    "       " + csr.getString(csr.getColumnIndex("Id")) +
                   "        " + csr.getString(csr.getColumnIndex("Password")));
            Log.i("DataHel", Result);

            //   Log.i("DataHelp", "loop" + i);
            //   i++;

        }
         return Result;
    }
    public String displusers()
    {
        db=this.getWritableDatabase();
        String Result="";
        Cursor csr=db.rawQuery("SELECT Id , Name , Password FROM signup1 WHERE Choice = 0 OR Choice = 2",null);
        while(csr.moveToNext())
        {
            Result=Result.concat("\n" + csr.getString(csr.getColumnIndex("Name"))+"         "+csr.getString(csr.getColumnIndex("Id"))+"         "+csr.getString(csr.getColumnIndex("Password")));
        }
        return Result;
    }
    public Boolean checkUser(String id,String password)
    {
        Boolean p1=new Boolean(false);
        db=this.getWritableDatabase();
        Cursor csr=db.rawQuery("SELECT Id FROM signup1 WHERE Choice = 0 AND Password = '"+password+"'",null);
        while (csr.moveToNext())
        {
            p1=true;
        }
        return p1;
    }
    public Boolean suspended(String id,String password)
    {
        Boolean p1=new Boolean(false);
        db=this.getWritableDatabase();
            Cursor csr=db.rawQuery("SELECT Id FROM signup1 WHERE Id = '"+id+"' AND Password = '"+password+"' AND Choice = 2",null);
            while(csr.moveToNext())
            {
                p1=true;
            }
            return p1;
    }
    public Boolean loginUser(String id , String password) {
        Boolean p1 = new Boolean(false);
        db = this.getWritableDatabase();
        try {
           // String query = "SELECT  Id" + " From signup1 WHERE Id =" + id + " AND Password = " + "password" + " AND Choice = 1";

            String query = "SELECT  Id From signup1 WHERE Id ='"+id+"'  AND Password = '"+password+"' AND Choice = 1";
            Cursor csr = db.rawQuery(query, null);

            while (csr.moveToNext()) {
                p1 = true;
            }
        }
        catch(Exception ex)
        {
            Log.i("Help",ex.getMessage());
        }
        return p1;
    }

    public User catchBatchCourse(String Id)
    {
        db=this.getWritableDatabase();
        String quer ="SELECT Batch , Course FROM signup1 WHERE Id = '"+Id+"' ";
        Cursor csr = db.rawQuery(quer,null);
        while(csr.moveToNext())
        {
            String batch = csr.getString(csr.getColumnIndex("Batch"));
            String course =csr.getString(csr.getColumnIndex("Course"));
            u1.setBatch(batch);
            u1.setCourse(course);
        }
        return u1;
    }
    public User catchBatch(String Id)
    {
        db=this.getWritableDatabase();
        String quer ="SELECT Batch  FROM signup1 WHERE Id = '"+Id+"' ";
        Cursor csr = db.rawQuery(quer,null);
        while(csr.moveToNext())
        {
            String batch = csr.getString(csr.getColumnIndex("Batch"));

            u1.setBatch(batch);

        }
        return u1;
    }
    public void changePassword(String Id ,String password)
    {
      db=this.getWritableDatabase();
      db.execSQL(" UPDATE signup1 set Password = '"+password+"'  WHERE Id= '"+Id+"' " );
    }
    public void activateRecord(String Id)
    {
        db=this.getWritableDatabase();
        db.execSQL(" UPDATE signup1 set Choice =" + "1" +  " WHERE Id= '"+Id+"' ");
    }
    public void removeRecord(String Id)
    {
      db=this.getWritableDatabase();
      db.execSQL(" DELETE FROM signup1 WHERE Id = '"+Id+"' ");
    }
    public void suspendEntries(String Id)
    {
        db=this.getWritableDatabase();
        db.execSQL(" UPDATE signup1 set Choice =" + "2" + " WHERE Id= '"+Id+"' ");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       // db=new SQLiteDatabase();
        db.execSQL( "CREATE TABLE IF NOT EXISTS " + "signup1" + "("
                + "Id" + " TEXT  PRIMARY KEY  ,"
                + "Batch" + " TEXT NOT NULL,"
                +"Name"+" TEXT ,"+"Course"+" TEXT ,"
                + "Username" + " TEXT ,"+"Password"+" TEXT ,"
                + "Choice" + " TEXT DEFAULT 0" + ")");
        db.execSQL( "CREATE TABLE IF NOT EXISTS " + "queries" + "("
                + "Record" + " TEXT  PRIMARY KEY  ,"
                + "Id" + " TEXT NOT NULL,"
                +"Question"+" TEXT ,"+"Response"+" TEXT DEFAULT NULL "
                +  ")");
        db.execSQL("CREATE TABLE IF NOT EXISTS time_table( SerialNo TEXT PRIMARY KEY , Batch  TEXT  , DAY  TEXT NOT NULL , Start_Date TEXT ,End_Date TEXT ,Time TEXT DEFAULT NULL )");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS"+" signup");
    }
}
