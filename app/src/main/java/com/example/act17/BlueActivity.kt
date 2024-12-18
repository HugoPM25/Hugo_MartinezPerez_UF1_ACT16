package com.example.act17


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class BlueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue)


        val textView = findViewById<TextView>(R.id.colorText)


        textView.text = "RGB: (0, 0, 255)"


        findViewById<RelativeLayout>(R.id.activityLayout).setBackgroundColor(0xFF2196F3.toInt())





        val buttonBack = findViewById<Button>(R.id.buttonBack)


        buttonBack.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}