package com.example.elderly.basicappactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.elderly.R

class SignupActivity : AppCompatActivity() {

    private lateinit var btnContinue : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnContinue = findViewById(R.id.btnContinue)

        btnContinue.setOnClickListener {
            val intent = Intent(this,SignUpStepTwoActivity::class.java)
            startActivity(intent)
        }
    }
}