package com.jokopriyono.dogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val myName = intent.getStringExtra("name")
        val myCity = intent.getStringExtra("city")
        val myCountry = intent.getStringExtra("country")

        findViewById<TextView>(R.id.txtName).text = myName
        findViewById<TextView>(R.id.txtLocation).let {
            val location = "$myCity, $myCountry"
            it.text = location
        }
    }
}