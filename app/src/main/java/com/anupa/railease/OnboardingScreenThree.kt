package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class OnboardingScreenThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding_screen_three)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val previous = findViewById<ImageView>(R.id.previous)
        previous.setOnClickListener {
            val intent = Intent(this, OnboardingScreenTwo::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        }

        val getStarted = findViewById<Button>(R.id.getStarted)
        getStarted.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_up,
                R.anim.slide_out_down
            )
        }
    }
}