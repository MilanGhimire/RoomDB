package com.sthapit.srijeetsthapit_mapd711_assignment4.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.AdminUser

@Dao
interface AdminUserDao {

    @Insert
    fun insert(user: AdminUser)


    @Query("SELECT * FROM adminUsers")
    fun getAllUsers():List<AdminUser>
}