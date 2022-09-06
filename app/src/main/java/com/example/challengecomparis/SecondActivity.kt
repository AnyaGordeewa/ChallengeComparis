package com.example.challengecomparis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challengecomparis.databinding.CarsListBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : CarsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CarsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val carsAdapter = CarsAdapter()
        with(binding.carListRecyclerview) {
            adapter = carsAdapter
            layoutManager = LinearLayoutManager(this@SecondActivity)
        }
        carsAdapter.setCars(MainActivity.cars)

    }
}