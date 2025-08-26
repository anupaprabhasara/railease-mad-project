package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class RegisterPage : AppCompatActivity() {

    private lateinit var fullName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var confirmPwd: EditText
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Grab views
        register   = findViewById(R.id.register)
        fullName   = findViewById(R.id.fullName)
        email      = findViewById(R.id.email)
        password   = findViewById(R.id.password)
        confirmPwd = findViewById(R.id.confirmpwd)

        // Start disabled (also in XML) + visual cue
        setRegisterEnabled(false)

        // Attach listeners for realtime validation
        val watcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validateAndUpdateUI()
            }
        }
        fullName.addTextChangedListener(watcher)
        email.addTextChangedListener(watcher)
        password.addTextChangedListener(watcher)
        confirmPwd.addTextChangedListener(watcher)

        // Navigate only if valid (button remains disabled otherwise)
        register.setOnClickListener {
            // Final guard — shouldn’t trigger if disabled, but safe:
            if (validateAndUpdateUI()) {
                val intent = Intent(this, LoginPage::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
        }

        val linkText = findViewById<TextView>(R.id.linkText)
        linkText.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down)
        }
    }

    /** Central validator: sets field errors and enables/disables button. Returns overall validity. */
    private fun validateAndUpdateUI(): Boolean {
        val nameStr  = fullName.text?.toString()?.trim().orEmpty()
        val emailStr = email.text?.toString()?.trim().orEmpty()
        val pwdStr   = password.text?.toString().orEmpty()
        val cpStr    = confirmPwd.text?.toString().orEmpty()

        // Validate each field
        val nameValid  = isNameValid(nameStr)
        val emailValid = isEmailValid(emailStr)
        val pwdValid   = isPasswordStrong(pwdStr)
        val matchValid = cpStr.isNotEmpty() && pwdStr == cpStr

        // Set/clear errors (only show after user has typed something)
        fullName.error   = when {
            nameStr.isEmpty() -> null
            nameValid -> null
            else -> "Enter your full name (min 2 words)"
        }

        email.error      = when {
            emailStr.isEmpty() -> null
            emailValid -> null
            else -> "Enter a valid email address"
        }

        password.error   = when {
            pwdStr.isEmpty() -> null
            pwdValid -> null
            else -> "Min 8 chars, 1 upper, 1 lower, 1 number, 1 symbol"
        }

        confirmPwd.error = when {
            cpStr.isEmpty() -> null
            matchValid -> null
            else -> "Passwords do not match"
        }

        val allValid = nameValid && emailValid && pwdValid && matchValid
        setRegisterEnabled(allValid)
        return allValid
    }

    private fun setRegisterEnabled(enabled: Boolean) {
        register.isEnabled = enabled
        // Optional visual hint when disabled
        register.alpha = if (enabled) 1f else 0.5f
    }

    private fun isNameValid(name: String): Boolean {
        // At least two words with letters; tweak as you like
        val parts = name.split("\\s+".toRegex()).filter { it.isNotBlank() }
        return parts.size >= 2 && parts.all { it.length >= 2 }
    }

    private fun isEmailValid(email: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    private fun isPasswordStrong(pw: String): Boolean {
        if (pw.length < 8) return false
        val hasUpper = pw.any { it.isUpperCase() }
        val hasLower = pw.any { it.isLowerCase() }
        val hasDigit = pw.any { it.isDigit() }
        val hasSymbol = pw.any { !it.isLetterOrDigit() }
        return hasUpper && hasLower && hasDigit && hasSymbol
    }
}