package com.example.gitpractice.demo.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gitpractice.databinding.ActivityEventBinding
import com.example.gitpractice.databinding.ActivityMainBinding

class EventActivity : AppCompatActivity() {

    private lateinit var binding :  ActivityEventBinding
    override fun onCreate(savedInstanceState: Bundle? ) {
        super.onCreate(savedInstanceState)
      binding =   ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}