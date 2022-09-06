package com.example.challengecomparis

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.challengecomparis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.navigateBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.favouritesCounterText.text = cars.count { it.isFavourite }.toString()
    }

    companion object {
        val cars = mutableListOf<Car>(
            Car("Audi"),
            Car("BMW", true),
            Car("Tesla", true),
            Car("Mercedes"),
            Car("Kia"),
            Car("Volvo", true),
            Car("Subaru"),
            Car("Toyota")
        )
    }

}

