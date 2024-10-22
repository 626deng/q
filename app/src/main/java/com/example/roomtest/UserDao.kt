package com.example.roomtest

import androidx.room.*

@Dao
interface UserDao {

    @Insert
    fun insertData(data: Data)

    @Delete
    fun deleteData(data: Data)

    @Update
    fun updateData(data: Data)

    @Query("select * from data")
    fun getAllData():List<Data>

    @Query("select * from data where age > :age")
    fun getDataOrderThan(age:Int):List<Data>

    @Query("delete from data where age > :age")
    fun deleteDataElderThan(age:Int)

}