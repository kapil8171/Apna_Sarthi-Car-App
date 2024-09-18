package com.example.apnasarthi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv_available_near_you)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        // Dummy data
        val carList = listOf(
            Car(R.drawable.car11, "Toyota Fortuner", "5 km away"),
            Car(R.drawable.car15, "Honda Civic", "10 km away"),
            Car(R.drawable.car12, "Ford Mustang", "15 km away"),
            Car(R.drawable.car13, "Marti", "15 km away")
        )

        val adapter = CarAdapter(carList)
        recyclerView.adapter = adapter

        }
    }
