package com.example.elderly.basicappactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.elderly.R
import org.json.JSONObject

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val image1 = findViewById<ImageView>(R.id.image1)
        val tvText = findViewById<TextView>(R.id.tvText)
        val btnNext =  findViewById<Button>(R.id.btnNext)
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_up)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

//        Animate
        image1.startAnimation(animation)
        tvText.startAnimation(animation)




//        Go to Sign Up
        btnNext.setOnClickListener{
            startActivity(Intent(this,SignupActivity::class.java))
        }
    }
}