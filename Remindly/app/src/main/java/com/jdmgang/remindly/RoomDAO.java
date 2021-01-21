package com.jdmgang.remindly;


import android.provider.CalendarContract;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RoomDAO {

    @Insert
    public void Insert(UsernamePassword... usernamePasswords);

    @Update
    public void Update(UsernamePassword... usernamePasswords);

    @Delete
    public void Delete(Reminders usernamePassword);

    @Query("Select * from login where usename = :username")
    public UsernamePassword getUserwithUsername(String username);

    @Query("Select * from login where isloggedIn = 1")
    public UsernamePassword getLoggedInUser();


    @Insert
    public void Insert(CalendarContract.Reminders... reminders);

    @Update
    public void Update(CalendarContract.Reminders... reminders);

    @Delete
    public void Delete(CalendarContract.Reminders reminders);

    @Query("Select * from reminders order by remindDate")
    public List<CalendarContract.Reminders> orderThetable();

    @Query("Select * from reminders Limit 1")
    public CalendarContract.Reminders getRecentEnteredData();

    @Query("Select * from reminders")
    public List<CalendarContract.Reminders> getAll();

}
