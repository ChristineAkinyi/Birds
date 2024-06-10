package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener{
            finish()
        }

        binding.btnNext2.setOnClickListener{
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
//        setContentView(R.layout.activity_second_bird)
//        val btnPrev = findViewById<ImageView>(R.id.btnPrev)
//        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)
//        btnPrev.setOnClickListener{
//            finish()
//        }
//        btnNext2.setOnClickListener{
//            val intent = Intent(this, ThirdBirdActivity::class.java)
//            startActivity(intent)
//        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1518992028580-6d57bd80f2dd?q=80&w=1915&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView2)

    }
}