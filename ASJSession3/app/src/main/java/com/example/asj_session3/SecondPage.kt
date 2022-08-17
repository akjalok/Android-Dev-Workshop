package com.example.asj_session3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asj_session3.databinding.ActivitySecondPageBinding

class SecondPage : AppCompatActivity() {
    private lateinit var binding: ActivitySecondPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.insta.setOnClickListener {
            val url = "https://www.instagram.com"
            val websiteIntent = Intent(Intent.ACTION_VIEW)
            val uri = Uri.parse(url)
            websiteIntent.data = uri
            startActivity(websiteIntent)
        }
    }
}