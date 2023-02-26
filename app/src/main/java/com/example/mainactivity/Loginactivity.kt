package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

@Suppress("DEPRECATION")
class Loginactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        supportActionBar?.hide()

        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, AboutActivtiy::class.java)
            startActivity(intent)

        }
        val username = intent.getStringExtra("USERNAME")
        val welcomeMessage = "HEJ!, $username!"
        val welcomeMessageTextView: TextView = findViewById(R.id.textView3)
        welcomeMessageTextView.setText(welcomeMessage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}

