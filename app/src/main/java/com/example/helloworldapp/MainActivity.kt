package com.example.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.helloworldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var buttonTap: Boolean = false
    private var progress_value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressbar.max = 100
        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        progress_value += 10
        binding.progressbar.progress = progress_value
        binding.progressbar.secondaryProgress = 70

        var intent = Intent(application, SubActivity::class.java)
        startActivity(intent)
        buttonTap = !buttonTap
    }
}
