package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val jwl_1: Button = findViewById(R.id.jwl_1)
        jwl_1.setOnClickListener {
            val intent = Intent(this, TanggalActivity::class.java)
            startActivity(intent)
        }
    }
}