package com.example.helloworldapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private var buttonTap: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (buttonTap) {
            binding.textView.text = getString(R.string.hello)
            buttonTap = false
        } else {
            binding.textView.setText(R.string.world)
            buttonTap = true
        }
    }
}

/*
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var textView: TextView? = null
    private var button: Button? = null
    private var buttonTap: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        button = findViewById(R.id.button)

        button?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (buttonTap) {
            textView?.setText(R.string.hello)
            buttonTap = false
        } else {
            textView?.setText(R.string.world)
            buttonTap = true
        }
    }
}
*/

//class MainActivity : AppCompatActivity() {
//    private var textView: TextView? = null
//    private var button: Button? = null
//    private var buttonTap: Boolean = false
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        textView = findViewById(R.id.text_view)
//        button = findViewById(R.id.button)
//
//        button?.setOnClickListener {
//            if (buttonTap) {
//                textView?.setText("Hello")
//                buttonTap = false
//            } else {
//                textView?.setText("World")
//                buttonTap = true
//            }
//        }
//    }
//}

