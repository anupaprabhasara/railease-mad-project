package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class LoginPage : AppCompatActivity() {

    private lateinit var emailEt: EditText
    private lateinit var passwordEt: EditText
    private lateinit var loginBtn: Button
    private lateinit var linkText: TextView

    // Debounce multiple taps (optional but nice)
    private var lastClickTime = 0L
    private val clickDebounceMs = 600L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        emailEt = findViewById(R.id.email)
        passwordEt = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login)
        linkText = findViewById(R.id.linkText)

        // Start disabled until both fields valid
        loginBtn.isEnabled = false
        loginBtn.alpha = 0.6f

        // Recalculate on every change
        val watcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) { updateButtonState() }
        }
        emailEt.addTextChangedListener(watcher)
        passwordEt.addTextChangedListener(watcher)

        // IME action on password triggers attempt only if valid
        passwordEt.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                attemptLogin()
                true
            } else false
        }

        loginBtn.setOnClickListener {
            val now = System.currentTimeMillis()
            if (now - lastClickTime < clickDebounceMs) return@setOnClickListener
            lastClickTime = now
            attemptLogin()
        }

        linkText.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_up,
                R.anim.slide_out_down
            )
        }
    }

    private fun updateButtonState() {
        val email = emailEt.text?.toString()?.trim().orEmpty()
        val pass = passwordEt.text?.toString().orEmpty()

        val emailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val passEntered = pass.isNotEmpty()

        loginBtn.isEnabled = emailValid && passEntered
        loginBtn.alpha = if (loginBtn.isEnabled) 1f else 0.6f
    }

    private fun attemptLogin() {
        // Guard: only continue if button is enabled (both valid)
        if (!loginBtn.isEnabled) return

        // Proceed to next screen (replace with real auth call when ready)
        val intent = Intent(this, HomePage::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down)
    }
}