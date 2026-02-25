package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.techlongue.R

class MainActivity : AppCompatActivity() {

    private var count = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText = findViewById<TextView>(R.id.numberText)
        val btnCheckIn = findViewById<Button>(R.id.btnCheckIn)
        val btnCheckOut = findViewById<Button>(R.id.btnCheckOut)

        numberText.text = count.toString()

        btnCheckIn.setOnClickListener {
            count++
            numberText.text = count.toString()
        }

        btnCheckOut.setOnClickListener {
            if (count > 0) {
                count--
                numberText.text = count.toString()
            }
        }
    }
}