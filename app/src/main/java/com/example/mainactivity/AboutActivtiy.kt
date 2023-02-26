package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivtiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_activtiy)

        supportActionBar?.hide()
        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            println("Hello World!")


            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
    }
}
