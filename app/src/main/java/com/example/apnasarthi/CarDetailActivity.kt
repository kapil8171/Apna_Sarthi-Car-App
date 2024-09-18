package com.example.apnasarthi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apnasarthi.databinding.ActivityCarDetailBinding

class CarDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityCarDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}