package com.gautam.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var chat:ImageButton
    lateinit var alert: ImageButton
    lateinit var phone: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        chat = findViewById(R.id.imageButton5)
        chat.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            val toastMessage1 = "You are now in chat room"
            Toast.makeText(this, toastMessage1, Toast.LENGTH_SHORT).show()

        }

        alert = findViewById(R.id.imageButton13)


        alert.setOnClickListener {


            val toastMessage = "Your location is being shared to the government."
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
        phone = findViewById(R.id.imageButton14)


        phone.setOnClickListener {

            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
            val toastMessage = "Local Emergency Contacts in your area ."
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }






    }
}