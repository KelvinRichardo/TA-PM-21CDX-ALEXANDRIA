package com.uti.killas

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


class TanggalActivity : AppCompatActivity() {

    private lateinit var textViewDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanggal)


        textViewDate = findViewById(R.id.textview_date)
        val buttonDatePicker: Button = findViewById(R.id.button_date_picker)

        buttonDatePicker.setOnClickListener {
            showDatePickerDialog()
        }
    }

    private fun showDatePickerDialog() {
        // Ambil tanggal saat ini
        val calendar = Calendar.getInstance()

        // Buat Date Picker Dialog
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, monthOfYear, dayOfMonth ->
                // Proses saat tanggal dipilih
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, monthOfYear)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                // Format tanggal ke dalam format yang diinginkan
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val formattedDate = sdf.format(calendar.time)

                // Tampilkan tanggal yang dipilih pada TextView
                textViewDate.text = "Tanggal dipilih: $formattedDate"
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )

        // Tampilkan Date Picker Dialog
        datePickerDialog.show()

        val btn_konfirmasi: Button = findViewById(R.id.btn_konfirmasi)
        btn_konfirmasi.setOnClickListener {
            val intent = Intent(this, SelesaiActivity::class.java)
            startActivity(intent)

    }

    }
}
