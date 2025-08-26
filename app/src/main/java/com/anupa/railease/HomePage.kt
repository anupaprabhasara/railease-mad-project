package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val homePage = findViewById<ImageView>(R.id.homePage)
//        homePage.setOnClickListener {
//            val intent = Intent(this, HomePage::class.java)
//            startActivity(intent)
//            overridePendingTransition(
//                R.anim.slide_in_right,
//                R.anim.slide_out_left
//            )
//        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            val intent = Intent(this, BookingPage::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }

//        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
//        ticketsPage.setOnClickListener {
//            val intent = Intent(this, TicketsPage::class.java)
//            startActivity(intent)
//            overridePendingTransition(
//                R.anim.slide_in_right,
//                R.anim.slide_out_left
//            )
//        }

//        val profilePage = findViewById<ImageView>(R.id.profilePage)
//        profilePage.setOnClickListener {
//            val intent = Intent(this, ProfilePage::class.java)
//            startActivity(intent)
//            overridePendingTransition(
//                R.anim.slide_in_right,
//                R.anim.slide_out_left
//            )
//        }
    }
}