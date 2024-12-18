package com.example.act17


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class GreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)


        val textView = findViewById<TextView>(R.id.colorText)
        textView.text = "RGB: (0, 255, 0)"


        findViewById<RelativeLayout>(R.id.activityLayout).setBackgroundColor(0xFF4CAF50.toInt())


        val buttonBack = findViewById<Button>(R.id.buttonBack)


        buttonBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}