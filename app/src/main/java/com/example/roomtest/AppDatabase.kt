package com.example.roomtest

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(version = 1,entities = [Data::class])
abstract class AppDatabase: RoomDatabase() {
    abstract fun UserDao():UserDao

    companion object{
        @Volatile
       var instance:AppDatabase?=null

        @Synchronized
        fun getInstance(context: Context): AppDatabase
        {
            instance?.let {
                return it;
            }
            return Room.databaseBuilder(context.applicationContext,AppDatabase::class.java,"ss").build()
        }
    }
}