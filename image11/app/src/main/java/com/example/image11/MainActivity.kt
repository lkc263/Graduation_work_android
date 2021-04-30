package com.example.image11

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.image11.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v:VideoView = findViewById(R.id.videoView2)

        v.setVideoPath("android.resource://com.example.image11/"+R.raw.donghwa)

        v.start()
        v.setOnPreparedListener{
            m:MediaPlayer ->

            m.setOnVideoSizeChangedListener {

                m: MediaPlayer?, width:Int,height:Int ->

                val mediaController = MediaController(this)

                v.setMediaController(mediaController)

                mediaController.setAnchorView(v)






            }

        }
    }
}