package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Book3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book3)

        val jwl_3: Button = findViewById(R.id.jwl_3)
        jwl_3.setOnClickListener {
            val intent = Intent(this, TanggalActivity::class.java)
            startActivity(intent)
        }
    }
}