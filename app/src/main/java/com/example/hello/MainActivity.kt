package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1552728089-57bdde30beb3?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imgView)
    }
}
//        setContentView(R.layout.activity_main)
//        val btnNext = findViewById<ImageView>(R.id.btnNext)
//        btnNext.setOnClickListener{
//            val intent = Intent(this, SecondBirdActivity::class.java)
//            startActivity(intent)
//        }

