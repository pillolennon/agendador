package com.example.agendador

// MainActivity.kt
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(5000)//Duración del Splash
        installSplashScreen()

        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            val year = datePicker.year
            val month = datePicker.month
            val day = datePicker.dayOfMonth

            val hour = timePicker.hour
            val minute = timePicker.minute

            val calendar = Calendar.getInstance()
            calendar.set(year, month, day, hour, minute)

            // Aquí puedes guardar la cita en una base de datos o realizar cualquier otra acción
            // por ejemplo, mostrar un mensaje con la fecha y hora seleccionadas
            val formattedDateTime = "${day}/${month}/${year} ${hour}:${minute}"
            println("Cita guardada para: $formattedDateTime")
        }
    }
}
