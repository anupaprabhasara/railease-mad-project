package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentApproved : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.payment_approved)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
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

        val viewETicket = findViewById<Button>(R.id.viewETicket)
        viewETicket.setOnClickListener {
            startActivity(Intent(this, ETicketPrint::class.java))
        }
    }
}