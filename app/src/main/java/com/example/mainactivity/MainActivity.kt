package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val correctPassword = "apa123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val passwordInput: EditText = findViewById(R.id.password)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val inputPassword = passwordInput.text.toString()

            if (inputPassword == correctPassword) {
                val intent = Intent(this, Loginactivity::class.java)
                intent.putExtra("USERNAME", "Aman")
                startActivity(intent)
            } else {
                Toast.makeText(this, "Incorrect password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
