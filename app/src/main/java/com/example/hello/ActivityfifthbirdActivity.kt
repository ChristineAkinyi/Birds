package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityfifthbirdBinding
import com.squareup.picasso.Picasso

class ActivityfifthbirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityfifthbirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityfifthbirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)
//        val intent = Intent(this, FourthBirdActivity::class.java)
        binding.btnPrev5.setOnClickListener{
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1535083783855-76ae62b2914e?q=80&w=1935&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView9)
    }
}