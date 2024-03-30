package com.example.roomexample

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val ID:Long,
    val name:String,
    val phone:String
)