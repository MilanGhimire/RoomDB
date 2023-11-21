package com.sthapit.srijeetsthapit_mapd711_assignment4

import AdminViewModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sthapit.srijeetsthapit_mapd711_assignment4.databinding.ActivityAdminRegisterBinding
import com.sthapit.srijeetsthapit_mapd711_assignment4.db.AdminUserDatabase
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.AdminUser

class AdminRegister : AppCompatActivity() {

    private lateinit var adminViewModel: AdminViewModel
    private lateinit var binding: ActivityAdminRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locaDb= AdminUserDatabase.getAppDatabase(this)!!
//        val adminDao = AppDatabase.getDatabase(application).adminDao()
//        val repository = AdminRepository(adminDao)
//
//        adminViewModel = ViewModelProvider(this, AdminViewModelFactory(repository))[AdminViewModel::class.java]
//
        binding.registerAdmin.setOnClickListener(){
            val newUser = AdminUser(userName = "srijeet_sthapit", email = "srijeet@gmail.com", password = "password123", firstName = "Srijeet", lastName="Sthapit")
            locaDb.users().insert(newUser)
//            adminViewModel.registerAdmin(newUser)
        }

        binding.getAdinUserList.setOnClickListener {
            val dataInDatabase = locaDb.users().getAllUsers()
            binding.userResults.text = dataInDatabase.toString()
        }

    }
}