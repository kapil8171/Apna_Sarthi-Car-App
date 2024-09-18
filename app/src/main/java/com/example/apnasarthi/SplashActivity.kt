package com.example.apnasarthi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apnasarthi.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.letsGo.setOnClickListener {
            val intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
        }





    }
}