package com.anupa.railease

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doAfterTextChanged
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@Suppress("DEPRECATION")
class SearchScreen : AppCompatActivity() {

    private lateinit var departure: AutoCompleteTextView
    private lateinit var destination: AutoCompleteTextView
    private lateinit var travelDate: EditText
    private lateinit var numOfTickets: EditText
    private lateinit var trainClass: AutoCompleteTextView
    private lateinit var submitBtn: Button
    private lateinit var backBtn: ImageView

    private val dateFormat by lazy { SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
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

        bindViews()
        setupBackAction()
        setupDropdowns()
        setupDatePicker()
        setupLiveErrorClearing()
        setupSubmit()
    }

    private fun bindViews() {
        departure = findViewById(R.id.departure)
        destination = findViewById(R.id.destination)
        travelDate = findViewById(R.id.travelDate)
        numOfTickets = findViewById(R.id.numOfTickets)
        trainClass = findViewById(R.id.trainClass)
        submitBtn = findViewById(R.id.searchBtn)
        backBtn = findViewById(R.id.ivBack)
    }

    private fun setupBackAction() {
        backBtn.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun setupDropdowns() {
        val stations = resources.getStringArray(R.array.stations)
        val classes = resources.getStringArray(R.array.train_classes)

        val stationAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stations)
        departure.setAdapter(stationAdapter)
        destination.setAdapter(stationAdapter)

        val classAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, classes)
        trainClass.setAdapter(classAdapter)

        fun AutoCompleteTextView.wireDropdown() {
            setOnFocusChangeListener { _, hasFocus -> if (hasFocus) showDropDown() }
            setOnClickListener { showDropDown() }
        }
        departure.wireDropdown()
        destination.wireDropdown()
        trainClass.wireDropdown()
    }

    private fun setupDatePicker() {
        travelDate.setOnClickListener {
            val cal = Calendar.getInstance()
            val dpd = DatePickerDialog(
                this,
                { _, y, m, d ->
                    cal.set(Calendar.YEAR, y)
                    cal.set(Calendar.MONTH, m)
                    cal.set(Calendar.DAY_OF_MONTH, d)
                    cal.set(Calendar.HOUR_OF_DAY, 0)
                    cal.set(Calendar.MINUTE, 0)
                    cal.set(Calendar.SECOND, 0)
                    cal.set(Calendar.MILLISECOND, 0)
                    travelDate.setText(dateFormat.format(cal.time))
                    travelDate.error = null
                },
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            )
            dpd.datePicker.minDate = System.currentTimeMillis() // today onwards
            dpd.show()
        }
    }

    private fun setupLiveErrorClearing() {
        departure.doAfterTextChanged { departure.error = null }
        destination.doAfterTextChanged { destination.error = null }
        travelDate.doAfterTextChanged { travelDate.error = null }
        numOfTickets.doAfterTextChanged { numOfTickets.error = null }
        trainClass.doAfterTextChanged { trainClass.error = null }
    }

    private fun setupSubmit() {
        submitBtn.setOnClickListener {
            if (validateForm()) {
                // Optional: pass the search parameters to the next screen
                val intent = Intent(this, SearchResult::class.java).apply {
                    putExtra("departure", departure.text.toString().trim())
                    putExtra("destination", destination.text.toString().trim())
                    putExtra("travelDate", travelDate.text.toString().trim())
                    putExtra("numOfTickets", numOfTickets.text.toString().trim())
                    putExtra("trainClass", trainClass.text.toString().trim())
                }
                startActivity(intent)
                // Use your slide animation like in your example
                overridePendingTransition(
                    R.anim.slide_in_left,
                    R.anim.slide_out_right
                )
                // If you want to prevent coming back to this screen, uncomment:
                // finish()
            } else {
                Toast.makeText(this, "Please fix the errors above", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateForm(): Boolean {
        var ok = true

        val stationsSet = resources.getStringArray(R.array.stations)
            .map { it.trim().lowercase(Locale.getDefault()) }.toSet()
        val classesSet = resources.getStringArray(R.array.train_classes)
            .map { it.trim().lowercase(Locale.getDefault()) }.toSet()

        val dep = departure.text?.toString()?.trim().orEmpty()
        val des = destination.text?.toString()?.trim().orEmpty()
        val dateStr = travelDate.text?.toString()?.trim().orEmpty()
        val ticketsStr = numOfTickets.text?.toString()?.trim().orEmpty()
        val cls = trainClass.text?.toString()?.trim().orEmpty()

        // Departure
        if (dep.isEmpty()) {
            departure.error = "Choose a departure station"
            ok = false
        } else if (!stationsSet.contains(dep.lowercase(Locale.getDefault()))) {
            departure.error = "Select a station from the list"
            ok = false
        } else {
            departure.error = null
        }

        // Destination
        if (des.isEmpty()) {
            destination.error = "Choose a destination station"
            ok = false
        } else if (!stationsSet.contains(des.lowercase(Locale.getDefault()))) {
            destination.error = "Select a station from the list"
            ok = false
        } else {
            destination.error = null
        }

        // Same station check
        if (dep.isNotEmpty() && des.isNotEmpty() && dep.equals(des, ignoreCase = true)) {
            destination.error = "Departure and destination cannot be the same"
            ok = false
        }

        // Date
        if (dateStr.isEmpty()) {
            travelDate.error = "Select a travel date"
            ok = false
        } else {
            try {
                val chosen = dateFormat.parse(dateStr)!!
                val today = dateFormat.parse(dateFormat.format(Date()))!!
                if (chosen.before(today)) {
                    travelDate.error = "Date cannot be in the past"
                    ok = false
                } else {
                    travelDate.error = null
                }
            } catch (_: Exception) {
                travelDate.error = "Invalid date"
                ok = false
            }
        }

        // Tickets (1..6)
        val minT = 1
        val maxT = 6
        if (ticketsStr.isEmpty()) {
            numOfTickets.error = "Enter number of passengers"
            ok = false
        } else {
            val n = ticketsStr.toIntOrNull()
            if (n == null) {
                numOfTickets.error = "Enter a valid number"
                ok = false
            } else if (n < minT || n > maxT) {
                numOfTickets.error = "Passengers must be $minT to $maxT"
                ok = false
            } else {
                numOfTickets.error = null
            }
        }

        // Class
        if (cls.isEmpty()) {
            trainClass.error = "Select a class"
            ok = false
        } else if (!classesSet.contains(cls.lowercase(Locale.getDefault()))) {
            trainClass.error = "Select a class from the list"
            ok = false
        } else {
            trainClass.error = null
        }

        return ok
    }
}
