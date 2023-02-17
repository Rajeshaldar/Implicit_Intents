package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val WebButton= findViewById<CardView>(R.id.cdnweb)

        val CamButton= findViewById<CardView>(R.id.cdcam)

        WebButton.setOnClickListener{
          val intent= Intent(Intent.ACTION_VIEW)
          intent.data= Uri.parse("https://www.instagram.com/rajeshaldar007/")
          startActivity(intent)
        }
        CamButton.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }
    }
}