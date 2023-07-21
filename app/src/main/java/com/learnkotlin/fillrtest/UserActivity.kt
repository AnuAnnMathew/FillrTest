package com.learnkotlin.fillrtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnkotlin.fillrtest.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding : ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val imageId = intent.getIntExtra("ImageId",R.drawable.ic_launcher_foreground)

        binding.detailsText.text = name
        binding.detailsImage.setImageResource(imageId)
    }
}