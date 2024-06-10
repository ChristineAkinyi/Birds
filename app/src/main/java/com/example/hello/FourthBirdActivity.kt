package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImagePrev6.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener{
            val intent = Intent(this, ActivityfifthbirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1452570053594-1b985d6ea890?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView4)
    }
}