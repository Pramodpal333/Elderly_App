package com.example.elderly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.elderly.basicappactivity.OnboardingActivity
import com.example.elderly.basicappactivity.SignupActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoImage = findViewById<ImageView>(R.id.ivLogo)

        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.pop_anim)
        logoImage.startAnimation(slideAnimation)


        Handler().postDelayed({
            val i = Intent(this, SignupActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)

    }
}