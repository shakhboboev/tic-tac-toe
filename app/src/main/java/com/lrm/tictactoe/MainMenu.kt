package com.lrm.tictactoe

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val play_button: Button = findViewById(R.id.play_button)
        val info_button: Button = findViewById(R.id.info_button)


        play_button.setOnClickListener{
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        info_button.setOnClickListener{
            val intent = Intent(this, InfoMain::class.java)
            startActivity(intent)
        }
    }
    fun Music_on(view: View){
        MediaPlayer.create(this,R.raw.background_music).start()
    }
}