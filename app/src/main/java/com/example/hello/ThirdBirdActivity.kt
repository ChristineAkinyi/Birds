package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val btnimagePrev4 = findViewById<ImageView>(R.id.btnimagePrev4)
//        val btnNext3= findViewById<ImageView>(R.id.btnNext3)

        binding.btnImagePrev.setOnClickListener{
            finish()
        }

        binding.btnNext3.setOnClickListener{
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1606567595334-d39972c85dbe?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imgView)

    }
}