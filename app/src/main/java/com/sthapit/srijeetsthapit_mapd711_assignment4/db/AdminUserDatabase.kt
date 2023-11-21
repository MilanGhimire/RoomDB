package com.sthapit.srijeetsthapit_mapd711_assignment4.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sthapit.srijeetsthapit_mapd711_assignment4.dao.AdminUserDao
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.AdminUser

@Database(entities = [AdminUser::class], version =1, exportSchema = false)
abstract class AdminUserDatabase : RoomDatabase() {
    abstract fun users():AdminUserDao


    companion object {
        private var INSTANCE: AdminUserDatabase? = null
        fun getAppDatabase(context: Context): AdminUserDatabase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AdminUserDatabase::class.java, "room-kotlin-database"
                ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}