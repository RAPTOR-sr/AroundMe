package com.gautam.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val myListView: ListView = findViewById(R.id.myListView)
        val numbers = ArrayList<String>()
        numbers.add("Ambulance")
        numbers.add("Fire Department")
        numbers.add("Police")

        // Pass the numbers ArrayList to the ArrayAdapter
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers)
        myListView.adapter = arrayAdapter

        myListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val phoneNumber: String = when (position) {
                0 -> "1234567890" // Replace with the actual ambulance number
                1 -> "9876543210" // Replace with the actual fire department number
                2 -> "5555555555" // Replace with the actual police number
                else -> "" // Default empty value
            }

            if (!phoneNumber.isEmpty()) {
                // Create an intent to dial the phone number
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }
        }
    }
}