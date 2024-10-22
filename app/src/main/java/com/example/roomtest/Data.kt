package com.example.roomtest

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data")
class Data(val name:String,val age:Int)
{
    @PrimaryKey(autoGenerate = true)
    var id=0
}