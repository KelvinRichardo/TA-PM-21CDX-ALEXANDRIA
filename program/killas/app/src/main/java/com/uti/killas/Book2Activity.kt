package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Book2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book2)

        val jwl_2: Button = findViewById(R.id.jwl_2)
        jwl_2.setOnClickListener {
            val intent = Intent(this, TanggalActivity::class.java)
            startActivity(intent)
        }
    }
}