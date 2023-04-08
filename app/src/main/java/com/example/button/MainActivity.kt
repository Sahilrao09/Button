package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)

        button.setOnClickListener {
            val firstName = findViewById<EditText>(R.id.name).text.toString()
            val lastName = findViewById<EditText>(R.id.lastname).text.toString()

            val result = findViewById<EditText>(R.id.result)

            result.append(firstName+" "+lastName)
        }
    }
}