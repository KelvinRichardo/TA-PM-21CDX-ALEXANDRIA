package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        fun TampilkanVilla1(view: View) {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }
    }
}