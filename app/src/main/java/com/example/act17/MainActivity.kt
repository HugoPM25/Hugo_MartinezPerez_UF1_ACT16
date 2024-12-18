package com.example.act17

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val greenButton = findViewById<Button>(R.id.buttonGreen)
        val redButton = findViewById<Button>(R.id.buttonRed)
        val blueButton = findViewById<Button>(R.id.buttonBlue)

        greenButton.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            startActivity(intent)
        }

        redButton.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            startActivity(intent)
        }

        blueButton.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            startActivity(intent)
        }
    }
}
