package com.uti.killas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.uti.killas.databinding.ActivityBiodataBinding

class BioActivity : AppCompatActivity() {
    private lateinit var binding: BioActivity
    lateinit var name : EditText
    lateinit var JK : EditText
    lateinit var Nomor : EditText
    lateinit var lahir : EditText
    lateinit var MasukButtom : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBiodataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MasukButtom.setOnClickListener(View.OnClickListener {
            if (binding.name.text.toString() == "user" && binding.JK.text.toString() == "pria,wanita" && binding.Nomor.text.toString() == "" && binding.lahir.text.toString() == ""){
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()


        }
        })
}
    }