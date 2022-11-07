package com.example.elderly.basicappactivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import com.example.elderly.R

class SignupActivity : AppCompatActivity() {

    private lateinit var btnContinue : Button
    private lateinit var btnHaveAccount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnContinue = findViewById(R.id.btnContinue)
        btnHaveAccount = findViewById(R.id.HaveAccountRed)

        btnContinue.setOnClickListener {
            btnVibrate()
            val intent = Intent(this,SignUpStepTwoActivity::class.java)
            startActivity(intent)
        }

        btnHaveAccount.setOnClickListener {
            btnVibrate()
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

    //Vibrate when btn Clicked
    private fun btnVibrate() {
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(100)
    }
}