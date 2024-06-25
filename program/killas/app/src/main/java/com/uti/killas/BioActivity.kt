package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button


class BioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val MasukButton: Button = findViewById(R.id.MasukButton)
        MasukButton.setOnClickListener {
            val intent = Intent(this, RoomActivity::class.java)
            startActivity(intent)
    }

    fun tampilkanRoom(view: View) {
        val intent = Intent(this, RoomActivity::class.java)
        startActivity(intent)

}
