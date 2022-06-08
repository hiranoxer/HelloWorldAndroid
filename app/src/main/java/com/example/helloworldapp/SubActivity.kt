package com.example.helloworldapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworldapp.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            finish()
        }
    }
}
