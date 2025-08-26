package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UpdateProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.update_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- Views ---
        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etOld = findViewById<EditText>(R.id.etOldPassword)
        val etNew = findViewById<EditText>(R.id.etNewPassword)
        val etConf = findViewById<EditText>(R.id.etConfirmPassword)
        val updateProfile = findViewById<Button>(R.id.updateProfile)

        // Clear error while typing
        listOf(etName, etEmail, etOld, etNew, etConf).forEach { it.clearErrorOnType() }

        // --- Nav buttons (unchanged) ---
        findViewById<ImageView>(R.id.ivBack).setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
        findViewById<ImageView>(R.id.homePage).setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
        findViewById<ImageView>(R.id.bookingPage).setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }
        findViewById<ImageView>(R.id.ticketsPage).setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }
        findViewById<ImageView>(R.id.profilePage).setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        // --- Validate then submit ---
        updateProfile.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val oldPw = etOld.text.toString()
            val newPw = etNew.text.toString()
            val confPw = etConf.text.toString()

            // Name required
            if (name.isEmpty()) {
                etName.error = "Name is required"
                etName.requestFocus()
                return@setOnClickListener
            }

            // Email format
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "Enter a valid email"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            // Old password required
            if (oldPw.isEmpty()) {
                etOld.error = "Old password is required"
                etOld.requestFocus()
                return@setOnClickListener
            }

            // New password rules
            validatePassword(newPw)?.let { reason ->
                etNew.error = reason
                etNew.requestFocus()
                return@setOnClickListener
            }

            // New must differ from old
            if (newPw == oldPw) {
                etNew.error = "New password must be different from old password"
                etNew.requestFocus()
                return@setOnClickListener
            }

            // Confirm match
            if (newPw != confPw) {
                etConf.error = "Passwords do not match"
                etConf.requestFocus()
                return@setOnClickListener
            }

            // All good – proceed
            Toast.makeText(this, "Profile updated", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MyProfile::class.java))
        }
    }

    /** Returns an error string if invalid, else null. */
    private fun validatePassword(pw: String): String? {
        if (pw.length < 8) return "At least 8 characters"
        if (!pw.any { it.isUpperCase() }) return "Must include an uppercase letter"
        if (!pw.any { it.isLowerCase() }) return "Must include a lowercase letter"
        if (!pw.any { it.isDigit() }) return "Must include a digit"
        val special = Regex("[^A-Za-z0-9]")
        if (!special.containsMatchIn(pw)) return "Must include a special character"
        return null
    }

    /** Clear setError as the user types */
    private fun EditText.clearErrorOnType() {
        this.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (error != null) error = null
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }
}