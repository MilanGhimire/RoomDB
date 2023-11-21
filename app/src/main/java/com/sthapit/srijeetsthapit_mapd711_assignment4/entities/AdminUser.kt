package com.sthapit.srijeetsthapit_mapd711_assignment4.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "adminUsers")
data class AdminUser (
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    val userName: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val email: String
)
