package com.example.creatinglibraryapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.testmodule.TestActivity
import com.example.testmodule.Toaster

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val show = findViewById<Button>(R.id.showToast)
        show.setOnClickListener{
            val intent = Intent(this,TestActivity::class.java)
            startActivity(intent)
        }

    }
}