package com.uti.killas


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, BioActivity::class.java)
            startActivity(intent)


        }
        fun TampilkanBiodata(view: View) {
            val intent = Intent(this, BioActivity::class.java)
            startActivity(intent)
        }
    }
}


