package com.example.apnasarthi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val carList: List<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carImage: ImageView = itemView.findViewById(R.id.img_car)
        val carName: TextView = itemView.findViewById(R.id.tv_car_name)
        val carLocation: TextView = itemView.findViewById(R.id.tv_car_location)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = carList[position]
        holder.carImage.setImageResource(car.imageResId)
        holder.carName.text = car.name
        holder.carLocation.text = car.location
    }

    override fun getItemCount(): Int = carList.size
}
