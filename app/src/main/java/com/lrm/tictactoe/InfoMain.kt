package com.lrm.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InfoMain : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_main)
        val back_btn: Button = findViewById(R.id.back)
        back_btn.setOnClickListener{
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }


}