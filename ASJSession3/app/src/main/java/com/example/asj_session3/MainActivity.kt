package com.example.asj_session3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.asj_session3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnTapme.setOnClickListener{
            Toast.makeText(applicationContext, "Button Tapped", Toast.LENGTH_SHORT).show()
        }
        binding.btnPage2.setOnClickListener {
            val intent = Intent(this,SecondPage::class.java)
            startActivity(intent)
        }




    }
}