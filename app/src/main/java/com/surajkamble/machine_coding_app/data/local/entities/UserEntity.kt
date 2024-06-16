package com.surajkamble.machine_coding_app.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id:Long = 0,
    val name:String,
    val upiId:String
)
