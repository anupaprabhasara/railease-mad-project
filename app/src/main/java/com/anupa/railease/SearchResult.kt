package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bookBtn1 = findViewById<Button>(R.id.bookBtn1)
        bookBtn1.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val bookBtn2 = findViewById<Button>(R.id.bookBtn2)
        bookBtn2.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val bookBtn3 = findViewById<Button>(R.id.bookBtn3)
        bookBtn3.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val searchBox = findViewById<LinearLayout>(R.id.searchBox)
        searchBox.setOnClickListener {
            val intent = Intent(this, SearchScreen::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }
    }
}