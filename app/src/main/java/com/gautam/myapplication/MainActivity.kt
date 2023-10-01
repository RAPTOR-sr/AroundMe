package com.gautam.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var alert:ImageButton
    lateinit var chat:ImageButton
    lateinit var profileh:ImageButton
    lateinit var chate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alert = findViewById(R.id.imageButton6)


        alert.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            val toastMessage = "Your location is being shared to the government."
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
        chat = findViewById(R.id.imageButton3)
        chat.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            val toastMessage1 = "You are now in chat room"
            Toast.makeText(this, toastMessage1, Toast.LENGTH_SHORT).show()

        }
        profileh = findViewById(R.id.imageButton7)

        profileh.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
            val toastMessage2 = "Edit your ptofile"
            Toast.makeText(this, toastMessage2, Toast.LENGTH_SHORT).show()

        }

    }
}