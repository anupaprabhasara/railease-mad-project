package com.anupa.railease

import android.content.Intent
import android.graphics.ImageDecoder
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load

class PaymentProcess : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private var navigateRunnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.payment_process)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ---- Play the loading animation (GIF or XML) ----
        val loader = findViewById<ImageView>(R.id.imageView2)
        startLoader(loader, R.drawable.loading_anim)

        // ---- Top/back ----
        findViewById<ImageView>(R.id.ivBack).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, BookingPage::class.java))
            finish()
        }

        // ---- Bottom nav (no custom animations) ----
        findViewById<ImageView>(R.id.homePage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }
        // bookingPage is this screen; keep disabled or no-op

        findViewById<ImageView>(R.id.ticketsPage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, MyETickets::class.java))
            finish()
        }
        findViewById<ImageView>(R.id.profilePage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, MyProfile::class.java))
            finish()
        }

        // ---- Auto-redirect after 1500 ms ----
        navigateRunnable = Runnable {
            startActivity(Intent(this, PaymentApproved::class.java))
            finish()
        }
        handler.postDelayed(navigateRunnable!!, 1500)
    }

    private fun startLoader(iv: ImageView, resId: Int) {
        // 1) Try ImageDecoder (real GIFs on API 28+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            try {
                val src = ImageDecoder.createSource(resources, resId)
                val d = ImageDecoder.decodeDrawable(src)
                iv.setImageDrawable(d)
                when (d) {
                    is android.graphics.drawable.AnimatedImageDrawable -> d.start()
                    is Animatable -> d.start()             // animated-vector
                }
                return
            } catch (_: Throwable) {
                // fall through to next strategies
            }
        }

        // 2) If it's an XML animation-list / animated-vector in drawable
        iv.setImageResource(resId)
        (iv.drawable as? Animatable)?.start()
        (iv.drawable as? AnimationDrawable)?.start()
        // If it started, we're done
        if ((iv.drawable as? Animatable)?.isRunning == true) return
        if ((iv.drawable as? AnimationDrawable)?.isRunning == true) return

        // 3) Final fallback: Coil with GIF support (coil-gif)
        //    Make sure you added:
        //    implementation "io.coil-kt:coil:2.6.0"
        //    implementation "io.coil-kt:coil-gif:2.6.0"
        iv.load(resId) {
            allowHardware(false) // safer for animated content
            crossfade(true)
        }
    }

    private fun cancelAutoNavigate() {
        navigateRunnable?.let { handler.removeCallbacks(it) }
        navigateRunnable = null
    }

    override fun onDestroy() {
        cancelAutoNavigate()
        super.onDestroy()
    }
}