package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.uti.killas.BookActivity
import com.uti.killas.Book2Activity
import com.uti.killas.Book3Activity

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val cv1: CardView = findViewById(R.id.cv1)
        cv1.setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)

            val cv2: CardView = findViewById(R.id.cv2)
            cv2.setOnClickListener {
                val intent = Intent(this, Book2Activity::class.java)
                startActivity(intent)

                val cv3: CardView = findViewById(R.id.cv3)
                cv3.setOnClickListener {
                    val intent = Intent(this, Book3Activity::class.java)
                    startActivity(intent)
                }
            }
        }


    }
}

