package com.example.helloworldapp

import android.app.ActionBar
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout.*
import android.widget.LinearLayout
import android.widget.TextView
import com.example.helloworldapp.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var buttonTap: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var dp = resources.displayMetrics.density
        var sp = resources.displayMetrics.scaledDensity
        var layout = LinearLayout(this)

        var mParent = LayoutParams.MATCH_PARENT
        var wContent = LayoutParams.WRAP_CONTENT

        layout.layoutParams = LayoutParams(mParent, mParent)
        layout.orientation = VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(0xdf, 0xff, 0xef))

        setContentView(layout)

        val textView = TextView(this)
        textView.text = getString(R.string.hello)
        textView.textSize = 50 * sp
        textView.layoutParams = LayoutParams(wContent, wContent)
        layout.addView(textView)

        val button = Button(this)
        button.text = getString(R.string.button)
        val buttonLayoutParams = LayoutParams((250 * dp).toInt(), wContent)
        buttonLayoutParams.topMargin = (40 * dp).toInt()
        button.layoutParams = buttonLayoutParams

        layout.addView(button)

        button.setOnClickListener{
            if (buttonTap) {
                textView.text = getString(R.string.hello)
                buttonTap = false
            } else {
                textView.setText(R.string.world)
                buttonTap = true
            }
        }
    }
}
